package hello;

public class ArrayDemo {

	public static void main(String[] args) {
		//Tableau dont on connait les éléments à l'avance
		int[] tab = {1, 2, 3, 4, 5, 6};
		System.out.println(tab[0]);
		System.out.println(tab[5]);
		
		tab[0] = 42;
		System.out.println(tab[0]);
		System.out.println(tab.length);
		
		
		//Créer un tableau de string qui contient "Hello" et "World"
		String[] tableau = {"Hello","World"};
		System.out.println(tableau[0]);
		System.out.println(tableau[1]);
		System.out.println(tableau[0]+ " " + tableau[1]);
		System.out.println(tableau.length);
		
		//Tableau dont on connait que le type des éléments mais pas le contenu
		int[] tabDeTaille6 = new int[6];
		tabDeTaille6[0] = 156;
		tabDeTaille6[1] = 166;
		tabDeTaille6[2] = 176;
		tabDeTaille6[3] = 186;
		tabDeTaille6[4] = 196;
		System.out.println(tabDeTaille6[0]);
		System.out.println(tabDeTaille6[1]);
		for (int i = 0; i < tabDeTaille6.length; i++) {
			System.out.println(tabDeTaille6[i]);
		}
	}

}
