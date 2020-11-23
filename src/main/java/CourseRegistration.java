import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CourseRegistration implements java.io.Serializable{
    ArrayList list = new ArrayList<course>();
    private LocalDate date;
    private String status = "Pending";
    private student student;
        
    
    private int regNum;
        
    
    CourseRegistration(){
        
    }
    
    
    public void readRegisterNum(){
        try{
            FileInputStream fis= new FileInputStream("./data/info.txt");
            Scanner sc=new Scanner(fis);
            regNum=Integer.valueOf(sc.nextLine());
            System.out.println(regNum);
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
    
    public void writeRegisterNum(){
      try {
      regNum++;
      FileWriter fw = new FileWriter("./data/info.txt");
      fw.write("");
      fw.write(String.valueOf(regNum));
      fw.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    
    public void setDate(){
        date= LocalDate.now();
    }
    
    public String getDate(){
        return date.toString();
    }
    
    public void setStatus(String s){
        status=s;
    }
    
    public String getStatus(){
        return status;
    }
    public void setStudent(student s){
        student=s;
    }
    public student getStudent(){
        return student;
    }
    public int getRegNum(){
        return regNum;
    }
}
