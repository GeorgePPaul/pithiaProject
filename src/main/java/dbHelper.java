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
    public ArrayList userDB = new ArrayList<user>();
    public ArrayList courseDB = new ArrayList<course>();
    public ArrayList cRegDB = new ArrayList<CourseRegistration>();
    public ArrayList gradesDB = new ArrayList<grade>();

    public String currentSemester = "September-February";

    dbHelper(){
        
    }
    
    


//WRITE INFO TO TXT
    public void writeUser(String data, String filePath){ //FILE PATH PARAMETER TO BE ADDED
    try(FileWriter fw = new FileWriter(filePath, true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    try(BufferedReader br = new BufferedReader(new FileReader(filePath))){      
        for(String line; (line = br.readLine()) != null; ) {
            if(line.equals(data))
                throw new EntityExistsException("This user exists in the system");
          
        }
        out.println(data);
        
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
public void serializeUsers(String filePath){
    try {
         FileOutputStream fileOut = new FileOutputStream(filePath);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(userDB);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }

public void serializeCourses(String filePath){
    try {
         FileOutputStream fileOut = new FileOutputStream(filePath);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(courseDB);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }

public void serializeCourseRegistrations(String filePath){
    try {
         FileOutputStream fileOut = new FileOutputStream(filePath);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(cRegDB);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }

public void serializeGrades(String filePath){
    try {
         FileOutputStream fileOut = new FileOutputStream(filePath);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(gradesDB);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }



    //LOAD SERIALIZED ARRAY
public void deserializeUsers(String filePath){ 
      try {
         FileInputStream fileIn = new FileInputStream(filePath);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         userDB = (ArrayList<user>)in.readObject();
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

public void deserializeCourseRegistrations(String filePath){ 
      try {
         FileInputStream fileIn = new FileInputStream(filePath);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         cRegDB = (ArrayList<CourseRegistration>)in.readObject();
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

public void deserializeCourses(String filePath){ 
      try {
         FileInputStream fileIn = new FileInputStream(filePath);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         courseDB = (ArrayList<course>)in.readObject();
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

public void deserializeGrades(String filePath){ 
      try {
         FileInputStream fileIn = new FileInputStream(filePath);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         gradesDB = (ArrayList<grade>)in.readObject();
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
      

