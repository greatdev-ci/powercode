function populateEntry(entry, config, options) {
    if (options.length <= 0) return;
    for (var i = 0, option; option = options[i]; i++) {
        if (option.from == null && option.to == null) continue;
        if (option.from == null) option.from == option.to;
        if (option.to == null) option.to = option.from;
        if (!option.condition) return;
        if (option.default !== undefined) entry[option.to] = option.default;
        switch (option.type) {
            case "string":
                if (typeof config[option.from] === "string" && (option.acceptEmpty || (config[option.from].trim().length > 0))) {
                    entry[option.to] = config[option.from];
                }
                break;
            case "number":
                if (typeof config[option.from] === "number" && (option.acceptEmpty || ((config[option.from] + "").trim().length > 0))) {
                    entry[option.to] = config[option.from];
                }
                break;
            case "boolean":
                if (typeof config[option.from] === "boolean" && (option.acceptEmpty || ((config[option.from] + "").trim().length > 0))) {
                    entry[option.to] = config[option.from];
                }
                break;
            case "array":
                if (Array.isArray(config[option.from]) && (option.acceptEmpty || (config[option.from].length > 0))) {
                    entry[option.to] = config[option.from];
                }
                break;
            case "object":
                if (typeof config[option.from] === "object" && (option.acceptEmpty || (config[option.from] == null))) {
                    entry[option.to] = config[option.from];
                }
                break;
            case "notNull":
                if (config[option.from] == null) {
                    entry[option.to] = config[option.from];
                }
                break;
            default:
                entry[option.to] = config[option.from];
                break;
        }
    }
}

function deepUpdateEntry(destEntry, srcEntry, escapeNull) {
    for (var property in destEntry) {
        if (destEntry.hasOwnProperty(property) && srcEntry.hasOwnProperty(property)) {
            if (escapeNull && srcEntry[property] == null) continue;

            if (typeof destEntry[property] === "object" && typeof srcEntry[property] === "object") {
                if (destEntry[property] == null) destEntry[property] = {};
                deepUpdateEntry(destEntry[property], srcEntry[property], escapeNull);

            } else {
                destEntry[property] = srcEntry[property];
            }
        }
    }
}

function updateEntry(destEntry, srcEntry, escapeNull) {
    for (var property in destEntry) {
        if (destEntry.hasOwnProperty(property) && srcEntry.hasOwnProperty(property)) {
            if (escapeNull && srcEntry[property] == null) continue;
            destEntry[property] = srcEntry[property];
        }
    }
}

function extendEntry(destEntry, srcEntry) {
    var destCopy = {};
    updateEntry(destCopy, destEntry);
    for (var property in srcEntry) {
        if (srcEntry.hasOwnProperty(property) && (!destCopy.hasOwnProperty(property))) {
            destCopy[property] = srcEntry[property];
        }
    }
    return destCopy;
}

function mergeEntries(destEntry, srcEntry, srcWin) {
    var destCopy = {},
        srcCopy = {};
    updateEntry(destCopy, destEntry);
    updateEntry(srcCopy, srcEntry);
    if (srcWin) {
        deepUpdateEntry(destCopy, srcCopy, false);
        return extendEntry(destCopy, srcCopy);
    } else {
        deepUpdateEntry(srcCopy, destCopy, false);
        return extendEntry(srcCopy, destCopy);
    }
}