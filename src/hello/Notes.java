package hello;

public class Notes {

	public static void main(String[] args) {
		int[] notes = {18, 20, 2, 14, 7, 10};
		// 1. calculer la moyenne des notes
		// 2. Trouver la plus petite note
		//3.Trouver la plus grande note

		int somme = 0;
		int min = 0;
		int max = 0;
		double variance = 0;
		double ecartType = 0;

		//1. La moyenne (average ou mean en anglais)
		double moyenne;
		for (int i = 0; i < notes.length; i++) {
			somme += notes[i];
			moyenne = 1.0 * somme / notes.length; //oubien on fait (double) somme / notes.length;
		}
		
			//System.out.println(somme);
		//	System.out.println("La moyenne des notes est :" + " " + moyenne);

		//2. La plus petite note

		min = notes[0];
		for (int i = 1; i < notes.length; i++) {
			if(notes[i] < min){
				min = notes[i];
			} 
		}
		System.out.println("La plus petite note est :" + " " + min);

		//3. La plus grande note

		max = notes[0];
		for (int i = 1; i < notes.length; i++) {
			if(notes[i] > max){
				max = notes[i];
			} 
		}
		System.out.println("La plus grande note est :" + " " + max);
		
		//4. Calculer la variance
		
		/*for (int i = 0; i < notes.length; i++) {
			variance += somme(((notes[i] - moyenne) * (notes[i] - moyenne))) / notes.length;
		}
				
		//5. Calculer l'ecart type (stddev)
		double ecartType = sqrt(variance);*/
		
	}

}
