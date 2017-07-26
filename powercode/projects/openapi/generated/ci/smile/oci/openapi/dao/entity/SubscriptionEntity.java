package ci.smile.oci.openapi.dao.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Table;
import java.util.Date;
import ci.smile.oci.openapi.helpers.enums.ActivationStatusEnum;

@Entity
@Table(name="Subscription" )
public class SubscriptionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id" )
    private Integer id;
    
    @Column(name="policy" , length=255 )
    private String policy;
    
    @Column(name="workflowRef" , length=255 )
    private String workflowRef;
    
    @Column(name="status" , length=1 )
    private ActivationStatusEnum status;
    
    @Column(name="app_id" )
    private Integer applicationId;
    
    @Column(name="apiName" , length=255 )
    private String apiName;
    
    @Column(name="apiVersion" , length=255 )
    private String apiVersion;
    
    @Column(name="apiContext" , length=255 )
    private String apiContext;
    
    @Column(name="created_by" , length=255 )
    private String createdBy;
    
    @Temporal(TemporalType.DATE)
    @Column(name="created_at" )
    private Date createdAt;
    
    @Column(name="updated_by" , length=255 )
    private String updatedBy;
    
    @Temporal(TemporalType.DATE)
    @Column(name="updated_at" )
    private Date updatedAt;
    
    @Column(name="deleted_by" , length=255 )
    private String deletedBy;
    
    @Temporal(TemporalType.DATE)
    @Column(name="deleted_at" )
    private Date deletedAt;
    
    @Column(name="is_deleted" , length=1 )
    private Boolean isDeleted;
    


    
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
