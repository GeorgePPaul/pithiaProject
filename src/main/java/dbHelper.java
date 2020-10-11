import java.io.FileWriter;  
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;    
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;



public class dbHelper implements java.io.Serializable{
    public ArrayList list = new ArrayList<user>();
    
    
    
    dbHelper(){
    }
    
    
    //WRITE INFO TO TXT
    public void writeUser(String x){ //FILE PATH PARAMETER TO BE ADDED
    try(FileWriter fw = new FileWriter("./data/userlist.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    try(BufferedReader br = new BufferedReader(new FileReader("./data/userlist.txt"))){      
        for(String line; (line = br.readLine()) != null; ) {
            if(line.equals(x))
                throw new EntityExistsException("This user exists in the system");
          
        }
        out.println(x);
        
    }
    catch(EntityExistsException e){
        System.out.println(e);
    }
   
} catch (IOException e) {
    System.out.println("An error occurred.");
      e.printStackTrace();
}
    }
    
    //SERIALISE ARRAY
public void serializeToFile(ArrayList lst){    //FILE PATH PARAMETER TO BE ADDED
    try {
         FileOutputStream fileOut = new FileOutputStream("./data/obj.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(lst);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in ./data/obj.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }

    //ADD OBJ TO LIST
public void addUserList(user u){
    list.add(u);
}

    //LOAD SERIALIZED ARRAY
public void deserializeFromFile(){ //FILE PATH PARAMETER TO BE ADDED
      try {
         FileInputStream fileIn = new FileInputStream("./data/obj.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         list = (ArrayList)in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Class not found");
         c.printStackTrace();
         return;
      }
}      
      
}    
      

