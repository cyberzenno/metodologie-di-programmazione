package evoluzionedellestrutturedati;

public interface CodaConPriorita {
	void addNext(String next);
	void addFirst(String first);
	void remove(String remove);
	void stampa();
	void stampa(String bannerIfAny);
}
