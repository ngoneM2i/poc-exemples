package hello;

public class Nombres {

	public static void main(String[] args) {
		//1. afficher les nombres de 1 à 100
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("- the end");

		//2. afficher les nombre pairs de 1 à 100
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

			//2.' essayer de trouver une autre maniere d'afficher les nombres pais de 1 à 100
			for (int j = 2; j <= 100; j+=2) {
				{
					System.out.println(j);
				}
			}
		}
	}
}
