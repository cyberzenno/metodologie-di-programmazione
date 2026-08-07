
public class Labirinto {
	private Corridoio corridoioIniziale;

	public Labirinto(Corridoio corridoioIniziale) {
		this.corridoioIniziale = corridoioIniziale;
	}

	public Corridoio getCorridoioIniziale() {
		return corridoioIniziale;
	}

	public boolean percorri() {
		return percorriCorridoio(this.corridoioIniziale, 0);
	}

	private boolean percorriCorridoio(Corridoio c, int depth) {
		String depthPadding = "     ".repeat(depth);

		System.out.printf("%s percorro corridoio: %s\n", depthPadding, c.hasMinotauro() ? "MINOTAURO" : "_");

		if (c.getCorridoi().size() == 0 && !c.hasMinotauro()) {
			System.out.printf("%s vicolo ceco. Torno indietro.\n", depthPadding);
			return false;
		}

		if (c.hasMinotauro()) {
			System.out.printf("%s Trovato. Gli stacco la testa e me la porto via!\n", depthPadding);
			return true;
		}

		for (Corridoio cc : c.getCorridoi()) {

			var trovato = percorriCorridoio(cc, depth + 1);
			if (trovato) {
				System.out.printf("%s Torno indietro con la TESTA DI MINOTAURO.\n", depthPadding);
				return true;
			}
		}

		System.out.printf("%s nulla su questo ramo. Torno indietro.\n", depthPadding);

		return false;

	}

}
