import java.io.FileWriter;  
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;



public class dbHelper {
    
    dbHelper(){
    }
    
    public void writeUser(String x){
    try(FileWriter fw = new FileWriter("./data/userlist.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    try(BufferedReader br = new BufferedReader(new FileReader("./data/userlist.txt"))){      
        for(String line; (line = br.readLine()) != null; ) {
            if(line.equals(x.toString()))
                throw new EntityExistsException("This user exists in the system");
          
        }
        out.println(x.toString());
        
    }
    catch(EntityExistsException e){
        System.out.println(e);
    }
   
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
