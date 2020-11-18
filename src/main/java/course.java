
public class course implements java.io.Serializable{
    private String id; 
    private String name;
    private String semester;
    private int ECTS;
    private staff teacher;  //IF TEACHER IS REMOVED FROM DB THIS BECOMES NULL, NEEDS WORKAROUND
    private String info;
    
    course(String id, String name, String semester, int ECTS, staff teacher, String info){
        this.id=id;
        this.name=name;
        this.semester=semester;
        this.ECTS=ECTS;
        this.teacher=teacher;
        this.info=info;
        
    }
    
    
    public void setId(String x){id=x;}
    public void setName(String x){name=x;}
    public void setSemester(String x){semester=x;}
    public void setECTS(int x){ECTS=x;}
    public void setTeacher(staff x){teacher=x;}
    public void setInfo(String x){info=x;}
    
    public String getId(){return id;}
    public String getSemester(){return semester;}
    public int getECTS(){return ECTS;}
    public staff getTeacher(){return teacher;}
    public String getInfo(){return info;}
    public String getName(){return name;}
    
    
    

   
}
