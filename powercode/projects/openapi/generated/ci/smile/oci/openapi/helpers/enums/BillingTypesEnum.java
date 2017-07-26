package ci.smile.oci.openapi.helpers.enums;

public enum BillingTypesEnum{
    
    FREE("1"),
    
    PREPAID("2"),
    
    POSTPAID("3");
    

   private String value = "";

   BillingTypesEnum(String value){
       this.value = value;
   }

   public String getValue(){
       return value;
   }

}