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
@Table(name="application" )
public class ApplicationEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id" )
    private Integer id;
    
    @Column(name="name" , length=255 )
    private String name;
    
    @Column(name="policy" , length=255 )
    private String policy;
    
    @Column(name="workflowRef" , length=255 )
    private String workflowRef;
    
    @Column(name="status" , length=1 )
    private ActivationStatusEnum status;
    
    @Column(name="username" , length=255 )
    private String username;
    
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
