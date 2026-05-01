package evoluzionedellestrutturedati;

public class ArrayConFunzionalitaDiBase {

	private String[] o;

	public ArrayConFunzionalitaDiBase(String... strings) {
		print("constructor");

		o = strings;

		print();
	}

	public void removeAt(int x) {
		print("removeAt(" + x + ")");

		String[] n = new String[o.length - 1];

		for (int i = 0, j = 0; i < n.length; i++, j++) {

			if (i == x)
				j++;

			n[i] = o[j];

		}

		o = n;

		print();
	}

	public void removeAtAndShiftWithNewArray(int x) {

		print("removeAtAndShiftWithNewArray(" + x + ")");

		String[] n = new String[o.length];

		for (int i = 0, j = 0; i < n.length - 1; i++, j++) {

			if (j == x)
				j++;

			n[i] = o[j];
		}

		o = n;

		print();
	}

	public void removeAtAndShift(int x) {

		print("removeAtAndShift(" + x + ")");

		for (int i = 0, j = 0; i < o.length; i++, j++) {

			if (j == x)
				j++;

			boolean hasNext = j < o.length;

			o[i] = hasNext ? o[j] : null;
		}

		print();
	}

	public void remove(String val) {

		print("remove(" + val + ")");

		var n = new String[o.length - 1];

		for (int i = 0, j = 0; i < n.length; i++, j++) {

			if (o[j] == val)
				j++;

			n[i] = o[j];
		}

		o = n;

		print();
	}

	public void removeAndShiftWithNewArray(String val) {

		print("removeAndShiftWithNewArray(" + val + ")");

		var n = new String[o.length];

		for (int i = 0, j = 0; i < n.length - 1; i++, j++) {

			if (o[j] == val)
				j++;

			n[i] = o[j];
		}

		o = n;

		print();
	}

	public void removeAndShift(String val) {

		print("removeAndShift(" + val + ")");

		for (int i = 0, j = 0; i < o.length; i++, j++) {

			if (o[i] == val)
				j++;

			var hasNext = j < o.length;

			o[i] = hasNext ? o[j] : null;
		}

		print();
	}

	public void print(String printThis) {
		System.out.println(printThis);
	}

	public void print() {
		for (int i = 0; i < o.length; i++) {
			System.out.printf("%s: %s\n", i, o[i]);
		}

		System.out.println("-------------------");
	}

	// collauda
	public static void main(String[] args) {

		var a = new ArrayConFunzionalitaDiBase("A", "B", "x", "C", "y");

		a.removeAndShift("x");
		a.removeAndShift("y");
	}
}
