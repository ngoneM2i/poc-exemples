package hello;

public class Search {

	public static void main(String[] args) {
		int[] data = {1, 2, 5, 10, 72, 42, 33};
		//ecrire un programme qui cher si le nombre 10 est pr�sent dans le tableau
		//si pr�sent ecrire "trouv�" sinon ecrire "pas trouv�"

		boolean found = false;
		for (int i = 0; i < data.length; i++) {
			if(data[i] == 10) {
				found = true;
				break; // early exit
			}
		}
		if(found) {
			System.out.println("trouv�");
		} else {
			System.out.println("pas trouv�");
		}
	}

}
