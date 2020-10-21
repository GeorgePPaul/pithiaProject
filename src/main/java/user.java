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
    
    user(String id,String name,String password,String address,String email,int phone,String surname){
        this.id=id;
        this.name=name;
        this.password=password;
        this.address=address;
        this.email=email;
        this.phone=phone;
        this.surname=surname;
    }
    
    
    @Override
    public String toString(){
      return id+" "+name+" "+password+" "+address+" "+email+" "+phone+" "+surname;  
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

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
    
}
