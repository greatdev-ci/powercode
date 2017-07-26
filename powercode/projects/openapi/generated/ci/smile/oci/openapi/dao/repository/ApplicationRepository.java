package ci.smile.oci.openapi.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ci.smile.oci.openapi.dao.entity.ApplicationEntity;


@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationEntity, Integer>{

    @Query(""
        + " ") 
    ApplicationEntity findById(  @Param("id") Integer id);
    

    @Query(""
        + "select e from ApplicationEntity e where e.policy = :policy"
    + " ") 
    List<ApplicationEntity> findByPolicy(  @Param("policy") String policy); 

    


}
