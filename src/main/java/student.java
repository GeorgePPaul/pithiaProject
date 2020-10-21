import java.util.ArrayList;
public class student extends user implements java.io.Serializable{
    private int etosEisagogis;
    private int ects=0;
    
    private ArrayList courseList = new ArrayList<course>();
    
    student(String id,String name,String surname,String password,String address,String email,int phone){
        super(id,name,surname,password,address,email,phone);
        
    }
    
    public void setEtosEisagogis(int x){etosEisagogis=x;}
    public int getEtosEisagosis(){return etosEisagogis;}
    public int getECTS(){return ects;}
    public ArrayList getCourseList(){return courseList;};
    
    
}


