import java.util.ArrayList;

public class user implements java.io.Serializable{
    private String name;
    private String surname;
    private String id;
    private long phone;
    private String address;
    private String password;
    private String email;
    
    
    
    user(String id,String name,String surname,String password,String address,String email,long phone){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.password=password;
        this.address=address;
        this.email=email;
        this.phone=phone;      
    }
    
    
    @Override
    public String toString(){
      return id+" "+name+" "+surname+" "+password+" "+address+" "+email+" "+phone;  
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
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

    public long getPhone() {
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

    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    
    
}
