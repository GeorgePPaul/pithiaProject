import java.util.ArrayList;

public class user implements java.io.Serializable{
    private String name;
    private String id;
    private String password;
    
    ArrayList mathimata = new ArrayList<courses>();
    
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
