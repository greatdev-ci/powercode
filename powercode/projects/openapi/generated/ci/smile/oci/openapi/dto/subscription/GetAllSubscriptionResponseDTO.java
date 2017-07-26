package ci.smile.oci.openapi.dto.subscription;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import ci.smile.oci.openapi.dao.entity.SubscriptionEntity;
import java.util.Date;
import ci.smile.oci.openapi.helpers.enums.ActivationStatusEnum;
import java.util.List;
import ci.smile.oci.openapi.dto.subscription.GetAllSubscriptionResponseItemDTO;

@JsonInclude(Include.NON_NULL)
public class GetAllSubscriptionResponseDTO {

    private List<GetAllSubscriptionResponseItemDTO> items;

	public void populateFrom(List<SubscriptionEntity> entityList){
        if(this.items == null) this.items = new ArrayList<GetAllSubscriptionResponseItemDTO>();
        for(SubscriptionEntity entity : entityList){
            GetAllSubscriptionResponseItemDTO item = new GetAllSubscriptionResponseItemDTO();
            item.populateFrom(entity);
            this.items.add(item);
        }
	}

    public List<GetAllSubscriptionResponseItemDTO> getItems(){
        return this.items;
    }

    public void setItems(List<GetAllSubscriptionResponseItemDTO> items){
        this.items = items;
    }

}
