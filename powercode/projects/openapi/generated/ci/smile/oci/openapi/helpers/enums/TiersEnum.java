package ci.smile.oci.openapi.helpers.enums;

public enum TiersEnum{
    
    APPLICATION("1"),
    
    SUBSCRIPTION("2");
    

   private String value = "";

   TiersEnum(String value){
       this.value = value;
   }

   public String getValue(){
       return value;
   }

}