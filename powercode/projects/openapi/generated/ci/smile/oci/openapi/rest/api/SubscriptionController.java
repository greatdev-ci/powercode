package ci.smile.oci.openapi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import ci.smile.oci.openapi.dao.entity.SubscriptionEntity;
import ci.smile.oci.openapi.dto.subscription.CreateSubscriptionResponseDTO;
import ci.smile.oci.openapi.dto.subscription.CreateSubscriptionRequestDTO;
import ci.smile.oci.openapi.dto.subscription.UpdateSubscriptionResponseDTO;
import ci.smile.oci.openapi.dto.subscription.UpdateSubscriptionRequestDTO;
import ci.smile.oci.openapi.dto.subscription.DeleteSubscriptionResponseDTO;
import ci.smile.oci.openapi.dto.subscription.GetSubscriptionByIdResponseDTO;
import ci.smile.oci.openapi.dto.subscription.GetAllSubscriptionResponseDTO;
import java.util.List;
import java.util.Date;
import ci.smile.oci.openapi.helpers.enums.ActivationStatusEnum;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/Subscription")
public class SubscriptionController{

	@Autowired
	private SubscriptionRepository repository;

    
    @RequestMapping(value="/create", method=RequestMethod.PUT  , consumes={"application/json"}  , produces={"application/json"} )
    public Response<CreateSubscriptionResponseDTO> CreateSubscription(  @RequestBody CreateSubscriptionRequestDTO request){

    	Response<CreateSubscriptionResponseDTO> response = new Response<CreateSubscriptionResponseDTO> ();
		try{

			SubscriptionEntity entity = new SubscriptionEntity();

            request.populateEntity(entity);
            entity.setCreatedAt(new Date());
            SubscriptionEntity entitySaved =  repository.save(entity);

			CreateSubscriptionResponseDTO result = new CreateSubscriptionResponseDTO();
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
    public Response<UpdateSubscriptionResponseDTO> UpdateSubscription(  @PathVariable Integer id , @RequestBody UpdateSubscriptionRequestDTO request){

    	Response<UpdateSubscriptionResponseDTO> response = new Response<UpdateSubscriptionResponseDTO> ();
		try{

			SubscriptionEntity entity =  repository.findById(id);

            
            request.populateEntity(entity);
            entity.setUpdatedAt(new Date());
            SubscriptionEntity entitySaved =  repository.save(entity);

			UpdateSubscriptionResponseDTO result = new UpdateSubscriptionResponseDTO();
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
    public Response<DeleteSubscriptionResponseDTO> DeleteSubscription(  @PathVariable Integer id ){

    	Response<DeleteSubscriptionResponseDTO> response = new Response<DeleteSubscriptionResponseDTO> ();
		try{

			SubscriptionEntity entity =  repository.findById(id);

            repository.delete(entity);
            entity.setIsDeleted(true);
			entity.setDeletedAt(new Date());

			DeleteSubscriptionResponseDTO result = new DeleteSubscriptionResponseDTO();
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
    
    @RequestMapping(value="/Subscription/{id}", method=RequestMethod.GET  , consumes={"application/json"}  , produces={"application/json"} )
    public Response<GetSubscriptionByIdResponseDTO> GetSubscriptionById(  @PathVariable Integer id ){

    	Response<GetSubscriptionByIdResponseDTO> response = new Response<GetSubscriptionByIdResponseDTO> ();
		try{

			SubscriptionEntity entity =  repository.findById( id ) ;

            

			GetSubscriptionByIdResponseDTO result = new GetSubscriptionByIdResponseDTO();
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
    
    @RequestMapping(value="/Subscription/list", method=RequestMethod.GET  , produces={"application/json"} )
    public Response<GetAllSubscriptionResponseDTO> GetAllSubscription( ){

    	Response<GetAllSubscriptionResponseDTO> response = new Response<GetAllSubscriptionResponseDTO> ();
		try{

			List<SubscriptionEntity> entityList =  repository.findAll() ;

            

			GetAllSubscriptionResponseDTO result = new GetAllSubscriptionResponseDTO();
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
