package ci.smile.oci.openapi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import ci.smile.oci.openapi.dao.entity.ApplicationEntity;
import ci.smile.oci.openapi.dto.application.CreateApplicationResponseDTO;
import ci.smile.oci.openapi.dto.application.CreateApplicationRequestDTO;
import ci.smile.oci.openapi.dto.application.UpdateApplicationResponseDTO;
import ci.smile.oci.openapi.dto.application.UpdateApplicationRequestDTO;
import ci.smile.oci.openapi.dto.application.DeleteApplicationResponseDTO;
import ci.smile.oci.openapi.dto.application.GetApplicationByIdResponseDTO;
import ci.smile.oci.openapi.dto.application.GetAllApplicationResponseDTO;
import ci.smile.oci.openapi.dto.application.GetApplicationByPolicyResponseDTO;
import java.util.List;
import java.util.Date;
import ci.smile.oci.openapi.helpers.enums.ActivationStatusEnum;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/Application")
public class ApplicationController{

	@Autowired
	private ApplicationRepository repository;

    
    @RequestMapping(value="/create", method=RequestMethod.PUT  , consumes={"application/json"}  , produces={"application/json"} )
    public Response<CreateApplicationResponseDTO> CreateApplication(  @RequestBody CreateApplicationRequestDTO request){

    	Response<CreateApplicationResponseDTO> response = new Response<CreateApplicationResponseDTO> ();
		try{

			ApplicationEntity entity = new ApplicationEntity();

            request.populateEntity(entity);
            entity.setCreatedAt(new Date());
            ApplicationEntity entitySaved =  repository.save(entity);

			CreateApplicationResponseDTO result = new CreateApplicationResponseDTO();
            result.populateFrom(entitySaved);
            
			response.setData(result);
			response.setOk(true);
			response.setCustomMessage("Opération exécutée avec succès");

		}catch(Exception ex){
			response.setOk(false);
			response.setSystemMessage(ex.getMessage());
			response.setCustomMessage("Echec de l'opération!");
		}
		return response;

    }
    
    @RequestMapping(value="/update/{id}", method=RequestMethod.POST  , consumes={"application/json"}  , produces={"application/json"} )
    public Response<UpdateApplicationResponseDTO> UpdateApplication(  @PathVariable Integer id , @RequestBody UpdateApplicationRequestDTO request){

    	Response<UpdateApplicationResponseDTO> response = new Response<UpdateApplicationResponseDTO> ();
		try{

			ApplicationEntity entity =  repository.findById(id);

            
            request.populateEntity(entity);
            entity.setUpdatedAt(new Date());
            ApplicationEntity entitySaved =  repository.save(entity);

			UpdateApplicationResponseDTO result = new UpdateApplicationResponseDTO();
            result.populateFrom(entitySaved);
            
			response.setData(result);
			response.setOk(true);
			response.setCustomMessage("Opération exécutée avec succès");

		}catch(Exception ex){
			response.setOk(false);
			response.setSystemMessage(ex.getMessage());
			response.setCustomMessage("Echec de l'opération!");
		}
		return response;

    }
    
    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE  , consumes={"application/json"}  , produces={"application/json"} )
    public Response<DeleteApplicationResponseDTO> DeleteApplication(  @PathVariable Integer id ){

    	Response<DeleteApplicationResponseDTO> response = new Response<DeleteApplicationResponseDTO> ();
		try{

			ApplicationEntity entity =  repository.findById(id);

            repository.delete(entity);
            entity.setIsDeleted(true);
			entity.setDeletedAt(new Date());

			DeleteApplicationResponseDTO result = new DeleteApplicationResponseDTO();
            result.populateFrom(entity);
            
			response.setData(result);
			response.setOk(true);
			response.setCustomMessage("Opération exécutée avec succès");

		}catch(Exception ex){
			response.setOk(false);
			response.setSystemMessage(ex.getMessage());
			response.setCustomMessage("Echec de l'opération!");
		}
		return response;

    }
    
    @RequestMapping(value="/Application/{id}", method=RequestMethod.GET  , consumes={"application/json"}  , produces={"application/json"} )
    public Response<GetApplicationByIdResponseDTO> GetApplicationById(  @PathVariable Integer id ){

    	Response<GetApplicationByIdResponseDTO> response = new Response<GetApplicationByIdResponseDTO> ();
		try{

			ApplicationEntity entity =  repository.findById( id ) ;

            

			GetApplicationByIdResponseDTO result = new GetApplicationByIdResponseDTO();
            result.populateFrom(entity);
            
			response.setData(result);
			response.setOk(true);
			response.setCustomMessage("Opération exécutée avec succès");

		}catch(Exception ex){
			response.setOk(false);
			response.setSystemMessage(ex.getMessage());
			response.setCustomMessage("Echec de l'opération!");
		}
		return response;

    }
    
    @RequestMapping(value="/Application/list", method=RequestMethod.GET  , produces={"application/json"} )
    public Response<GetAllApplicationResponseDTO> GetAllApplication( ){

    	Response<GetAllApplicationResponseDTO> response = new Response<GetAllApplicationResponseDTO> ();
		try{

			List<ApplicationEntity> entityList =  repository.findAll() ;

            

			GetAllApplicationResponseDTO result = new GetAllApplicationResponseDTO();
            result.populateFrom(entityList);
            
			response.setData(result);
			response.setOk(true);
			response.setCustomMessage("Opération exécutée avec succès");

		}catch(Exception ex){
			response.setOk(false);
			response.setSystemMessage(ex.getMessage());
			response.setCustomMessage("Echec de l'opération!");
		}
		return response;

    }
    
    @RequestMapping(value="/list/{policy}", method=RequestMethod.GET  , produces={"application/json"} )
    public Response<GetApplicationByPolicyResponseDTO> GetApplicationByPolicy(  @PathVariable String policy ){

    	Response<GetApplicationByPolicyResponseDTO> response = new Response<GetApplicationByPolicyResponseDTO> ();
		try{

			List<ApplicationEntity> entityList =  repository.findByPolicy( policy ) ;

            

			GetApplicationByPolicyResponseDTO result = new GetApplicationByPolicyResponseDTO();
            result.populateFrom(entityList);
            
			response.setData(result);
			response.setOk(true);
			response.setCustomMessage("Opération exécutée avec succès");

		}catch(Exception ex){
			response.setOk(false);
			response.setSystemMessage(ex.getMessage());
			response.setCustomMessage("Echec de l'opération!");
		}
		return response;

    }
    

}
