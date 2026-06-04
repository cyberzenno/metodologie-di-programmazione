package factorymethod_parole;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ParoleSuFileSerializzato extends Parole {

	private String nomeFile;

	public ParoleSuFileSerializzato(String nomeFile) {
		this.nomeFile = nomeFile;
	}
	
	@Override
	public void salva() {
		try (ObjectOutputStream serializer = new ObjectOutputStream(new FileOutputStream(nomeFile))) {

			serializer.writeObject(parole);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void carica() {

		try (ObjectInputStream deserializer = new ObjectInputStream(new FileInputStream(nomeFile))) {

			parole = (ArrayList<String>) deserializer.readObject();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
