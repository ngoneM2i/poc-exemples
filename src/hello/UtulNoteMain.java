package hello;

public class UtulNoteMain {

	public static void main(String[] args) {  

		UtilNote utilNote = new UtilNote();

		int[] notes = {18, 20, 2, 14, 7, 10};

		double moyenne = utilNote.calcMoyenne(notes);
		
		int min = utilNote.findMin(notes);
		int max = utilNote.findMax(notes);
		
		System.out.println("La moyenne est de " + moyenne);
		System.out.println("Le min est: " + min);
		System.out.println("Le max est: " + max);
		
		int[] notes2 = {1, 2, 3, 4, 5};
		double moyenne2 = utilNote.calcMoyenne(notes2);
		System.out.println(moyenne2);
	}

}
