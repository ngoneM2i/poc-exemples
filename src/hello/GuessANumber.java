package hello;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		int nombreADEviner = 8;
		
		// �crire un programme qui demande �un utilisateur de deviner un nomvbre ente 1 et 10
		//Tant que l'utilisateur n'a pas devin� le bon nombre, �crire "perdu" puis dedemander � deviner.
		//quand l'utilisateur a devin� le bon nombre, ecrire gagn� et quitter
		
		//v1.1
		//ecrire "gagn� X coups"
		
		Scanner sc = new Scanner(System.in);
		
		int compteur = 0;
		for(;;) {
			int choixUtilisateur = sc.nextInt();
			compteur++;
		
			if(choixUtilisateur == nombreADEviner){
				System.out.println("Gagn� en " + " " + compteur + " " + "coups");
				break;
			} else {
			System.out.println("Prdu !");
			System.out.println("Deviner un nombre entre 1 et 10 svp");
			}
		}

	}

}
