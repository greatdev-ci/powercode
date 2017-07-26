package ci.smile.oci.openapi.dto.subscription;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import ci.smile.oci.openapi.dao.entity.SubscriptionEntity;
import java.util.Date;
import ci.smile.oci.openapi.helpers.enums.ActivationStatusEnum;


@JsonInclude(Include.NON_NULL)
public class GetSubscriptionByIdResponseDTO {

    
    private Integer id;
    
    private String policy;
    
    private String workflowRef;
    
    private ActivationStatusEnum status;
    
    private Integer applicationId;
    
    private String apiName;
    
    private String apiVersion;
    
    private String apiContext;
    
    private String createdBy;
    
    private Date createdAt;
    
    private String updatedBy;
    
    private Date updatedAt;
    
    private String deletedBy;
    
    private Date deletedAt;
    
    private Boolean isDeleted;
    


	public void populateFrom(SubscriptionEntity entity){
		this.id = entity.getId();
		this.policy = entity.getPolicy();
		this.workflowRef = entity.getWorkflowRef();
		this.status = entity.getStatus();
		this.applicationId = entity.getApplicationId();
		this.apiName = entity.getApiName();
		this.apiVersion = entity.getApiVersion();
		this.apiContext = entity.getApiContext();
		this.createdBy = entity.getCreatedBy();
		this.createdAt = entity.getCreatedAt();
		this.updatedBy = entity.getUpdatedBy();
		this.updatedAt = entity.getUpdatedAt();
		this.deletedBy = entity.getDeletedBy();
		this.deletedAt = entity.getDeletedAt();
		this.isDeleted = entity.getIsDeleted();
		
	}

    
    public Integer getId() {
       return id;
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
    
    public Date getCreatedAt() {
       return createdAt;
    }
    
    public String getUpdatedBy() {
       return updatedBy;
    }
    
    public Date getUpdatedAt() {
       return updatedAt;
    }
    
    public String getDeletedBy() {
       return deletedBy;
    }
    
    public Date getDeletedAt() {
       return deletedAt;
    }
    
    public Boolean getIsDeleted() {
       return isDeleted;
    }
    


    
    public void setId(Integer id) {
        this.id = id;
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
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }
    
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    

}
