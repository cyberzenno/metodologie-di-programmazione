import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumerareFileDiTesto {
	public static void main(String[] args) {

		ps.println("NumerareFileDiTesto");
		ps.println("-------------------");

		String inputFilePath = prompt("Inserisci path del file da leggere: ");
		String outputFilePath = prompt("Inserisci path del file da scrivere: ");

		try (BufferedReader r = Files.newBufferedReader(Paths.get(inputFilePath));
				BufferedWriter w = Files.newBufferedWriter(Paths.get(outputFilePath))) {

			int lineNumber = 1;
			while (r.ready()) {
				String rigaLetta = r.readLine();
				w.write("%s. %s\n".formatted(lineNumber++, rigaLetta));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ps.println("File salvato in " + outputFilePath);
	}

	// output
	private static PrintStream ps = System.out;

	// input
	private static InputStream is = System.in;
	private static Scanner inScanner = new Scanner(is);

	private static String prompt(String message) {

		ps.println(message);

		return inScanner.nextLine();
	}
}
