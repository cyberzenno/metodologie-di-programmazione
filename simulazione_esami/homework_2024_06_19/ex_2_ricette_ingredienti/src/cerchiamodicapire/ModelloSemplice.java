package cerchiamodicapire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import static java.util.stream.Collectors.*;

import ex_2_ricette_ingredienti.Ex2_Ricetta.Tipologia;

@SuppressWarnings("unused")
public class ModelloSemplice {

	public static void main(String[] args) {

		ArrayList<ModelloSemplice> lista = getRandomValues(10);

		var gruppoDiListe = lista.stream().collect(
				// raggruppa per "qualcosa"
				groupingBy(x -> x.tipo,
						// seleziona "quello che vuoi" come elemento/i
						mapping(x -> x.nome,
								// mettilo in questo preciso tipo di collezione
								toCollection(HashSet::new))));

//		print(gruppoDiListe);

		var listaDaListe = lista
				.stream()
				.flatMap(x -> x.elementi.stream())
				.collect(
						groupingBy(x -> x, 
								counting()
								)
						);

		print(listaDaListe);
	}

	private static void print(Object x) {
		System.out.println(x.getClass().getSimpleName() + "\n---------");
		System.out.println(x);
	}

	public enum Tipo {
		ROSSO, NERO, BLU, VERDE
	}

	private String nome;
	private String descrizione;
	private Tipo tipo;
	private List<String> elementi;

	public ModelloSemplice(String nome, String descrizione, Tipo tipo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.elementi = getElementiRandom(r.nextInt(10));
	}

	public String getNome() {
		return nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public Tipo getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "%s_%s_%s".formatted(nome, tipo, hashCode() % 100);
	}

	public static ArrayList<ModelloSemplice> getRandomValues(int n) {
		ArrayList<ModelloSemplice> lista = new ArrayList<>();

		lista.add(new ModelloSemplice("Fenice", "Modello leggendario rinato dalle ceneri", Tipo.ROSSO));
		lista.add(new ModelloSemplice("Lupo", "Modello indipendente e feroce", Tipo.NERO));
		lista.add(new ModelloSemplice("Stella", "Modello veloce e luminoso", Tipo.BLU));
		lista.add(new ModelloSemplice("Ombra", "Modello silenzioso e letale", Tipo.NERO));
		lista.add(new ModelloSemplice("Drago", "Modello potente e imponente", Tipo.ROSSO));
		lista.add(new ModelloSemplice("Fantasma", "Modello sfuggente e misterioso", Tipo.BLU));
		lista.add(new ModelloSemplice("Fulmine", "Modello velocissimo e devastante", Tipo.ROSSO));
		lista.add(new ModelloSemplice("Notte", "Modello oscuro e profondo", Tipo.VERDE));
		lista.add(new ModelloSemplice("Cuoco", "cuoco modello bravo", Tipo.ROSSO));
		lista.add(new ModelloSemplice("Tempesta", "Modello caotico e potente", Tipo.BLU));

		return new ArrayList<>(lista.subList(0, n));
	}

	private static Random r = new Random();

	private static List<String> getElementiRandom(int n) {
		var lista = List.of("cielo", "luna", "terra", "mare", "mammut", "sole", "vento", "montagna", "nebbia",
				"fulmine", "foresta", "fiume", "stella", "deserto", "ghiaccio");

		var listaRidotta = new ArrayList<String>();
		while (listaRidotta.size() < n) {
			var i = r.nextInt(lista.size());
			listaRidotta.add(lista.get(i));
		}

		return listaRidotta;
	}

}
