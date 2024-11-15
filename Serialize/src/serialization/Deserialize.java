package serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Deserialize {

	public static void main(String[] args) {
		User u1 = null;
		
		try(FileInputStream filein = new FileInputStream("u1.ser");
		ObjectInputStream in = new ObjectInputStream(filein)){
			u1 = (User) in.readObject();
			System.out.println("Deserialized User: " + u1);
		}catch(IOException | ClassNotFoundException i) {
			i.printStackTrace();
		}

	}

}
