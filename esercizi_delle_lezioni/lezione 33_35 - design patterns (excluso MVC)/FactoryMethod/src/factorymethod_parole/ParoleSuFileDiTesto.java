package factorymethod_parole;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ParoleSuFileDiTesto extends Parole {

	private String nomeFile;

	public ParoleSuFileDiTesto(String nomeFile) {
		this.nomeFile = nomeFile;
	}
	
	@Override
	public void salva() {
		try (BufferedWriter w = new BufferedWriter(new FileWriter(nomeFile))) {
			for (String parola : parole) {
				w.write(parola);
				w.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public void carica() {
		try (BufferedReader r = new BufferedReader(new FileReader(nomeFile))) {
			while (r.ready()) {
				String parola = r.readLine();
				
				parole.add(parola);
			}

		} catch (FileNotFoundException e) {
			salva();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
