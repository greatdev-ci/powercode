package ci.smile.oci.openapi.dto.subscription;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import ci.smile.oci.openapi.dao.entity.SubscriptionEntity;
import ci.smile.oci.openapi.helpers.enums.ActivationStatusEnum;


@JsonInclude(Include.NON_NULL)
public class CreateSubscriptionRequestDTO {

    
    private String policy;
    
    private String workflowRef;
    
    private ActivationStatusEnum status;
    
    private Integer applicationId;
    
    private String apiName;
    
    private String apiVersion;
    
    private String apiContext;
    
    private String createdBy;
    


	public void populateEntity(SubscriptionEntity entity){
		entity.setPolicy(this.policy);
		entity.setWorkflowRef(this.workflowRef);
		entity.setStatus(this.status);
		entity.setApplicationId(this.applicationId);
		entity.setApiName(this.apiName);
		entity.setApiVersion(this.apiVersion);
		entity.setApiContext(this.apiContext);
		entity.setCreatedBy(this.createdBy);
		
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
    
    public Integer getApplicationId() {
       return applicationId;
    }
    
    public String getApiName() {
       return apiName;
    }
    
    public String getApiVersion() {
       return apiVersion;
    }
    
    public String getApiContext() {
       return apiContext;
    }
    
    public String getCreatedBy() {
       return createdBy;
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
    
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }
    
    public void setApiName(String apiName) {
        this.apiName = apiName;
    }
    
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
    
    public void setApiContext(String apiContext) {
        this.apiContext = apiContext;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    

}
