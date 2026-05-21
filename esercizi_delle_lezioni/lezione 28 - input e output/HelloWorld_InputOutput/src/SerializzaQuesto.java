import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializzaQuesto {
	public static void main(String[] args) {

		Persona p = new Persona("Mario", "Rossi", 32);

		serialize(p);
		
		Persona xp = deserialize();
		
		System.out.println(xp);
	}

	private static void serialize(Persona p) {

		try (ObjectOutputStream serializer = new ObjectOutputStream(new FileOutputStream("Persona.ser"))) {

			serializer.writeObject(p);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static Persona deserialize() {

		Persona p = null;

		try (ObjectInputStream deserializer = new ObjectInputStream(new FileInputStream("Persona.ser"))) {

			p = (Persona) deserializer.readObject();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return p;
	}
}
