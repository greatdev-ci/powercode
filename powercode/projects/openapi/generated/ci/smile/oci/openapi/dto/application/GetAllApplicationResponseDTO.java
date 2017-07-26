package ci.smile.oci.openapi.dto.application;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import ci.smile.oci.openapi.dao.entity.ApplicationEntity;
import java.util.Date;
import ci.smile.oci.openapi.helpers.enums.ActivationStatusEnum;
import java.util.List;
import ci.smile.oci.openapi.dto.application.GetAllApplicationResponseItemDTO;

@JsonInclude(Include.NON_NULL)
public class GetAllApplicationResponseDTO {

    private List<GetAllApplicationResponseItemDTO> items;

	public void populateFrom(List<ApplicationEntity> entityList){
        if(this.items == null) this.items = new ArrayList<GetAllApplicationResponseItemDTO>();
        for(ApplicationEntity entity : entityList){
            GetAllApplicationResponseItemDTO item = new GetAllApplicationResponseItemDTO();
            item.populateFrom(entity);
            this.items.add(item);
        }
	}

    public List<GetAllApplicationResponseItemDTO> getItems(){
        return this.items;
    }

    public void setItems(List<GetAllApplicationResponseItemDTO> items){
        this.items = items;
    }

}
