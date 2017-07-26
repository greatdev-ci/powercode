package ci.smile.oci.openapi.dto.application;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import ci.smile.oci.openapi.dao.entity.ApplicationEntity;
import ci.smile.oci.openapi.helpers.enums.ActivationStatusEnum;


@JsonInclude(Include.NON_NULL)
public class UpdateApplicationRequestDTO {

    
    private String name;
    
    private String policy;
    
    private String workflowRef;
    
    private ActivationStatusEnum status;
    
    private String username;
    
    private String updatedBy;
    


	public void populateEntity(ApplicationEntity entity){
		entity.setName(this.name);
		entity.setPolicy(this.policy);
		entity.setWorkflowRef(this.workflowRef);
		entity.setStatus(this.status);
		entity.setUsername(this.username);
		entity.setUpdatedBy(this.updatedBy);
		
	}

    
    public String getName() {
       return name;
    }
    
    public String getPolicy() {
       return policy;
    }
    
    public String getWorkflowRef() {
       return workflowRef;
    }
    
    public ActivationStatusEnum getStatus() {
       return status;
    }
    
    public String getUsername() {
       return username;
    }
    
    public String getUpdatedBy() {
       return updatedBy;
    }
    


    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    public void setWorkflowRef(String workflowRef) {
        this.workflowRef = workflowRef;
    }
    
    public void setStatus(ActivationStatusEnum status) {
        this.status = status;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    

}
