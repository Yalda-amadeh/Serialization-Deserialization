package serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) {
		User u1 = new User("yalda","123456",50222910);
		
		try(FileOutputStream fileout = new FileOutputStream("u1.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileout)){
				out.writeObject(u1);
				System.out.println("Serialized data is saved in user.ser");
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
