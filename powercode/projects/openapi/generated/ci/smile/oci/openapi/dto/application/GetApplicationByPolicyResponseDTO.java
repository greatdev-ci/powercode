package ci.smile.oci.openapi.dto.application;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import ci.smile.oci.openapi.dao.entity.ApplicationEntity;
import java.util.Date;
import ci.smile.oci.openapi.helpers.enums.ActivationStatusEnum;
import java.util.List;
import ci.smile.oci.openapi.dto.application.GetApplicationByPolicyResponseItemDTO;

@JsonInclude(Include.NON_NULL)
public class GetApplicationByPolicyResponseDTO {

    private List<GetApplicationByPolicyResponseItemDTO> items;

	public void populateFrom(List<ApplicationEntity> entityList){
        if(this.items == null) this.items = new ArrayList<GetApplicationByPolicyResponseItemDTO>();
        for(ApplicationEntity entity : entityList){
            GetApplicationByPolicyResponseItemDTO item = new GetApplicationByPolicyResponseItemDTO();
            item.populateFrom(entity);
            this.items.add(item);
        }
	}

    public List<GetApplicationByPolicyResponseItemDTO> getItems(){
        return this.items;
    }

    public void setItems(List<GetApplicationByPolicyResponseItemDTO> items){
        this.items = items;
    }

}
