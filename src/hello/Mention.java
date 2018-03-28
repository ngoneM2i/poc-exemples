package hello;

public class Mention {

	public static void main(String[] args) {
		int note = 20;

		if (note < 10) {
			System.out.println("peut mieux faie");
		} else if (note < 12) {
			System.out.println("passable");
		} else if (note < 14) {
			System.out.println("Mension assez bien");
		} else if (note < 16) {
			System.out.println("Mention bien");
		} else {
			System.out.println("Mention très bien. Bravo!");
		}

	}
}
 