import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Persona {
	private String nome;
	private String cognome;
	private String codiceFiscale;

	public Persona(String nome, String cognome, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public static void main(String[] args) {

		List<Persona> persone = List.of(new Persona("Mario", "Rossi", "RSSMRA80A01A123Z"),
				new Persona("Luigi", "Verdi", "VRDLGG80A01A123Z"),
				new Persona("Princess", "Bianchi", "BNNPSS80A01A123Z"));

		// insieme dei CF usando gli stream
		Set<String> codiciFiscaliRaccoltiAMano = persone.stream().collect(() -> new HashSet<String>(),
				(s, e) -> s.add(e.codiceFiscale), (s1, s2) -> s1.addAll(s2));

		System.out.println(codiciFiscaliRaccoltiAMano);

		Set<String> codiciFiscaliConMap = persone.stream().map(x -> x.getCodiceFiscale()).collect(Collectors.toSet());
		System.out.println(codiciFiscaliConMap);

		Set<String> codiciFiscaliConMapRef = persone.stream().map(Persona::getCodiceFiscale)
				.collect(Collectors.toSet());
		System.out.println(codiciFiscaliConMapRef);

	}
}