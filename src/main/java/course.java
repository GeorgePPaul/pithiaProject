
public class course {
    private int id; 
    private int semester;
    private int dm;
    private staff teacher;  //IF TEACHER IS REMOVED FROM DB THIS BECOMES NULL, NEEDS WORKAROUND
    private String info;
    
    course(int id, int semester, int dm, staff teacher, String info){
        this.id=id;
        this.semester=semester;
        this.dm=dm;
        this.teacher=teacher;
        this.info=info;
        
    }
    
    
    public void setId(int x){id=x;}
    public void setSemester(int x){semester=x;}
    public void setDm(int x){dm=x;}
    public void setTeacher(staff x){teacher=x;}
    public void setInfo(String x){info=x;}
    
    public int getId(){return id;}
    public int getSemester(){return semester;}
    public int getDm(){return dm;}
    public staff getTeacher(){return teacher;}
    public String getInfo(){return info;}
    

   
}
