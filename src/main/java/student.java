import java.util.ArrayList;
public class student extends user implements java.io.Serializable{
    private int etosEisagogis;
    private int dm;
    
    private ArrayList courseList = new ArrayList<course>();
    
    student(String id,String name, String password ){
        super(id,name,password);
    }
    
    public void setEtosEisagogis(int x){etosEisagogis=x;}
    public int getEtosEisagosis(){return etosEisagogis;}
    public ArrayList getCourseList(){return courseList;};
    
    
}


