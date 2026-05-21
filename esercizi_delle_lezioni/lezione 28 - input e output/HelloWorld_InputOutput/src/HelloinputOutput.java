import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

@SuppressWarnings("unused")
public class HelloinputOutput {

	private static PrintStream ps = System.out;
	private static InputStream is = System.in;
	private static Scanner inScanner = new Scanner(is);

	public static void main(String[] args) {

		scriviFileConBufferedWriter();
	}
		
	private static void scriviFileConBufferedWriter() {
		try (BufferedWriter w = new BufferedWriter(new FileWriter("fileDiTestoScritto.txt"))) {
			String rigaDaScrivere;

			while(true) {
				rigaDaScrivere = prompt("Inserisci riga da scrivere su file (xxx to stop): ");
				
				if (rigaDaScrivere.equals("xxx"))
					break;

				w.write(rigaDaScrivere);
				w.newLine();
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}
	

	
	private static void leggiFileConBufferedReader() {
		
		try (BufferedReader br = new BufferedReader(new FileReader("fileDiTesto.txt"))) { //come sintassi, preferisco questo
//		try (BufferedReader br = Files.newBufferedReader(Paths.get("fileDiTesto.txt"))) {
			while (br.ready()) {

				ps.println(br.readLine());
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	private static void scriviFileConPrintWriter() {

		File f = new File("fileDiTestoScritto.txt");

		try (PrintWriter pw = new PrintWriter(f)) {

			String rigaDaScrivere = "";

			while (true) {
				rigaDaScrivere = prompt("Inserisci riga da scrivere su file (xxx to stop): ");

				if (rigaDaScrivere.equals("xxx"))
					break;

				pw.println(rigaDaScrivere);
			}

		} catch (FileNotFoundException e) {

		}

	}

	private static LinkedList<String> leggiFileConScanner() {

		/**
		 * nota: il percorso si riferisce alla root del progetto. in questo caso
		 * "HelloWorld_InputOutput\fileDiTesto.txt"
		 */
		File f = new File("fileDiTesto.txt");

		LinkedList<String> righe = new LinkedList<String>();

		try (Scanner in = new Scanner(f)) {

			while (in.hasNextLine()) {
				String riga = in.nextLine();
				ps.println(riga);

				righe.add(riga);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return righe;
	}

	private static void consoleInputOutput() {
		// 1. iniziamo dalla base: output su console
		ps.println("Hello IO World!");

		String input = "";

		while (!input.equals("stop")) {
			input = prompt(
					"Inserisci la tua prima riga di testo, cosi te la faccio vedere. Wow!! Digita 'stop' per terminare.");

			ps.println("Hai digitato: " + input);
		}
	}

	private static String prompt(String message) {

		ps.println(message);

		return inScanner.nextLine();
	}

}
