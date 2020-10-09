import java.io.FileWriter;  
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException; 



public class dbHelper{
    
    dbHelper(){
    }
    
    public void writeUser(String x){
    try(FileWriter fw = new FileWriter("./data/userlist.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    out.println(x.toString());
   
} catch (IOException e) {
    System.out.println("An error occurred.");
      e.printStackTrace();
}
    }
    
    
    /*
    try {
      FileWriter myWriter = new FileWriter("./data/userlist.txt");
      myWriter.write(x.toString());
      myWriter.append(x.toString());
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
      
      
    } 
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    */
    
      
}
