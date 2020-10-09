import java.io.FileWriter;  
import java.io.IOException; 


public class dbHelper {
    
    dbHelper(){
    }
    
    public void writeUser(user x){
    try {
      FileWriter myWriter = new FileWriter("./data/userlist.txt");
      myWriter.write(x.toString());
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    
}
