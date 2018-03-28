package hello;

public class FizzBuzz {

	public static void main(String[] args) {
		//System.out.println("fizz " + 3);
		// "fizz" + 3 == "fizz3"
		// "bonjour" + "" + "le" + "" + "le monde"
		// <=> "bonjour lr monde"

		// Pour les nombre de 0 à 100 inclus
		// afficher "nombre FIZZ" si nombre est multiple de 3
		// afficher "nombre BUZZ" si nombre est multiple de 5
		// afficher "nombre FIZZBUZZ" si nombre est multiple de 3 ET de 5

		//v1
		for (int i = 0 ; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + " " + "FIZZBUZZ");
			} else {
				if (i % 3 == 0) {
					System.out.println(i + " " + "FIZZ");
				}if (i % 5 == 0) {
					System.out.println(i + " " + "BUZZ");
				} 
			}
		}
		//v2
		for (int i = 0 ; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + " " + "FIZZBUZZ");
				continue;
			}
			if (i % 3 == 0) {
				System.out.println(i + " " + "FIZZ");
			}if (i % 5 == 0) {
				System.out.println(i + " " + "BUZZ");
			} 				
		}
		//v3
		for (int i = 0 ; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println(i + " " + "FIZZBUZZ");
			} else {
				if (i % 3 == 0) {
					System.out.println(i + " " + "FIZZ");
				}if (i % 5 == 0) {
					System.out.println(i + " " + "BUZZ");
				} 
			}
		}

		//v4
		for (int i = 0 ; i <= 100; i++) {
			if (i % 15 == 0)
			{
				System.out.println(i + " " + "FIZZBUZZ");
			} else {
				if (i % 3 == 0) {
					System.out.println(i + " " + "FIZZ");
				}if (i % 5 == 0) {
					System.out.println(i + " " + "BUZZ");
				} 
			}
		}
	}

}
