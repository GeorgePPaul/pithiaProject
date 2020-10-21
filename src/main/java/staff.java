
public class staff extends user implements java.io.Serializable{
    String tempVar="1";
    
    staff(String id,String name, String password,String address,String email,int phone,String surname){
        super(id,name,password,address,email,phone,surname);
    }
    
    @Override
    public String toString(){
        return super.toString()+" "+tempVar;
    }
}
