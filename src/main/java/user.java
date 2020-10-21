import java.util.ArrayList;

public class user implements java.io.Serializable{
    private String name;
    private String surname;
    private String id;
    private int phone;
    private String address;
    private String password;
    private String email;
    
    ArrayList mathimata = new ArrayList<course>();
    
    user(String id,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }
    
    
    @Override
    public String toString(){
      return id+" "+name+" "+password;  
    }
    
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public String getPassword(){
        return password;
    }
}
