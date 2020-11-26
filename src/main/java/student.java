import java.util.ArrayList;
public class student extends user implements java.io.Serializable{
    private int etosEisagogis;
    private int ects=0;
    private String semester;
    private CourseRegistration pendingRegistration;
    
    private ArrayList courseList = new ArrayList<studentCourse>();
    
    student(String id,String name,String surname,String password,String address,String email,long phone, int etos, String semester){
        super(id,name,surname,password,address,email,phone);
        etosEisagogis=etos;
        this.semester=semester;

    }
    
    public void setEtosEisagogis(int x){etosEisagogis=x;}
    public int getEtosEisagosis(){return etosEisagogis;}
    public int getECTS(){return ects;}
    public String getSemester(){return semester;}
    public ArrayList getCourseList(){return courseList;};
    
    public void setEcts(){
        for(Object o : courseList){
            if (((studentCourse)o).getState())
                ects+=((studentCourse)o).getCourse().getECTS();
        }
    }
    public void setPendingRegistration(CourseRegistration cR){
        pendingRegistration=cR;
    }
    public CourseRegistration getPendingRegistration(){
       return pendingRegistration;
    }

}


