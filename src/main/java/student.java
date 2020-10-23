import java.util.ArrayList;
public class student extends user implements java.io.Serializable{
    private int etosEisagogis;
    private int ects=0;
    private String semester;
    
    private ArrayList courseList = new ArrayList<course>();
    
    student(String id,String name,String surname,String password,String address,String email,int phone, int etos, String semester, int ects){
        super(id,name,surname,password,address,email,phone);
        etosEisagogis=etos;
        this.semester=semester;
        this.ects=ects;
    }
    
    public void setEtosEisagogis(int x){etosEisagogis=x;}
    public int getEtosEisagosis(){return etosEisagogis;}
    public int getECTS(){return ects;}
    public String getSemester(){return semester;}
    public ArrayList getCourseList(){return courseList;};
    
    
}


