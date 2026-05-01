package collezioni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TutteLeCollezioni {

	/*
	 * classe ANNIDATA in quanto STATICA
	 */
	static class Frutta {
		private String nome;

		Frutta(String nome) {
			this.nome = nome;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		@Override
		public String toString() {
			return this.nome + " (" + hashCode() + ")";
		}
	}

	public static void main(String[] args) {

		// IMMUTABLE BASE LIST
		List<Frutta> lista = List.of(new Frutta("Mela"), new Frutta("Banana"), new Frutta("Pera"),
				new Frutta("Arancia"), new Frutta("Kiwi"));

		try {
			lista.add(new Frutta("Carciofo"));
		} catch (Exception e) {
			print("Errore: " + e.getClass());
		}

		print(lista);

		// ARRAYLIST
		lista = new ArrayList<>(lista);

		lista.add(new Frutta("Carciofo"));

		print(lista);

		// LINKED LIST
		lista = new LinkedList<TutteLeCollezioni.Frutta>(lista);
		lista.add(new Frutta("Melanzana"));

		print(lista);

		// HASH SET
		Set<Frutta> set = new HashSet<Frutta>(lista);
		print(set);

		// TREE SET
		set = new TreeSet<>((a, b) -> a.nome.compareTo(b.nome)); //pare obbligatoria la comparazione
		set.addAll(lista);
		print(set);

		// notare che per via dell'unicita richiesta, comparando per lunghezza,
		// si puo avere solo una lunghezza unica, quindi Pera e Kiwi vengono ignorati
		set = new TreeSet<Frutta>((a, b) -> a.nome.length() - b.nome.length());
		set.addAll(lista);
		print(set);

		// LINKED HASH SET
		set = new LinkedHashSet<Frutta>(lista);
		set.addAll(lista);
		print(set);

		// HASHMAP
		Map<String, Frutta> map = new HashMap<>();
		for (Frutta f : lista) {
			map.put(f.nome, f);
		}
		print(map.values());

		// TREE MAP
		map = new TreeMap<>();
		for (Frutta f : lista) {
			map.put(f.nome, f);
		}
		print(map.values());

	}

	private static void print(Object o) {
		System.out.println(o);
	}

	private static void print(Iterable<Frutta> lista) {
		print("\nIn stampa: " + lista.getClass());
		print("-".repeat(20));
		for (Object o : lista) {
			print(o);
		}
	}
}
