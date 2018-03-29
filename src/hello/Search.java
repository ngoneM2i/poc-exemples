package hello;

public class Search {

	public static void main(String[] args) {
		int[] data = {1, 2, 5, 10, 72, 42, 33};
		//ecrire un programme qui cher si le nombre 10 est présent dans le tableau
		//si présent ecrire "trouvé" sinon ecrire "pas trouvé"

		boolean found = false;
		for (int i = 0; i < data.length; i++) {
			if(data[i] == 10) {
				found = true;
				break; // early exit
			}
		}
		if(found) {
			System.out.println("trouvé");
		} else {
			System.out.println("pas trouvé");
		}
	}

}
