
public class student extends user implements java.io.Serializable{
    private int etosEisagogis;
    private int dm;
    
    
    student(String id,String name, String password ){
        super(id,name,password);
    }
    
    public void setEtosEisagogis(int x){etosEisagogis=x;}
    public int getEtosEisagosis(){return etosEisagogis;}
    
    
    
}


