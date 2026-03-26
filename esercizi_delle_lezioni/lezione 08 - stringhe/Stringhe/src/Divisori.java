
public class Divisori {

	public static void main(String[] args) {
		int n = 20;

		String output = "";

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				output += output.isBlank() ? i : ", " + i;
			}
		}

		System.out.println(output);
	}

}
