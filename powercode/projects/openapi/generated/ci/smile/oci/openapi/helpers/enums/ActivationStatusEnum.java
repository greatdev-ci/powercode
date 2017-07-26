package ci.smile.oci.openapi.helpers.enums;

public enum ActivationStatusEnum{
    
    NOT_ACTIVATED("1"),
    
    ACTIVATED("2"),
    
    DISABLED("3");
    

   private String value = "";

   ActivationStatusEnum(String value){
       this.value = value;
   }

   public String getValue(){
       return value;
   }

}