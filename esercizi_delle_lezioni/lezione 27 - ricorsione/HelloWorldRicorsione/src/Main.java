
public class Main {
	public static void main(String[] args) {

		int[] numeriDaScorrere = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		stampaRicorsivamente(numeriDaScorrere, 0);

	}

	private static void stampaRicorsivamente(int[] numeriDaScorrere, int posizioneAttuale) {
		if (posizioneAttuale >= numeriDaScorrere.length)
			return;

		var padding = " ".repeat(posizioneAttuale);

		System.out.printf("%s%s\n", padding, numeriDaScorrere[posizioneAttuale]);

		stampaRicorsivamente(numeriDaScorrere, posizioneAttuale + 1);
		
		System.out.printf("%s|\n", padding);
	}
}
