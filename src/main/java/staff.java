
public class staff extends user implements java.io.Serializable{
    String tempVar="1";
    
    staff(String id,String name, String password){
        super(id,name,password);
    }
    
    @Override
    public String toString(){
        return super.toString()+" "+tempVar;
    }
}
