
public class grade implements java.io.Serializable{
    private student s;
    private studentCourse c;
    private double g;
    private String action;
    private String status="Pending";
    
    grade(student s, double g, studentCourse c,String action){
        this.s=s;
        this.g=g;
        this.c=c;
        this.action=action;
    }
    
    public student getStudent(){
        return s;
    }
    public double getGrade(){
        return g;
    }
    public void setAction(String str){
        action=str;
    }
    public String getAction(){
        return action;
    }
    public studentCourse getStudentCourse(){
        return c;
    }
    public void setStatus(String str){
        status=str;
    }
    public String getStatus(){
        return status;
    }
}
