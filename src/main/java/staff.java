
public class staff extends user implements java.io.Serializable{
    String tempVar="1";
    
    staff(String id,String name,String surname, String password,String address,String email,int phone){
        super(id,name,surname,password,address,email,phone);
    }
    
    @Override
    public String toString(){
        return super.toString()+" "+tempVar;
    }
}
