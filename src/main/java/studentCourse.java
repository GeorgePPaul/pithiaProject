
public class studentCourse implements java.io.Serializable{
    private course c;
    private double grade=0;
    private boolean passed = false;
    
    studentCourse(course c){
        this.c=c;
    }
    
    public void setPassed(boolean b){
        passed = b;
    }
    public course getCourse(){
        return c;
    }
    public boolean getState(){
        return passed;
    }
    
    public double getGrade(){
        return grade;
    }
    public void setGrade(double grade){
        this.grade=grade;
    }
    
}
