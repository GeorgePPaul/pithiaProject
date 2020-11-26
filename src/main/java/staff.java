
public class staff extends user implements java.io.Serializable{
   
    staff(String id,String name,String surname, String password,String address,String email,long phone){
        super(id,name,surname,password,address,email,phone);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
