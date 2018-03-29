package hello;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		int nombreADEviner = 8;
		
		// écrire un programme qui demande àun utilisateur de deviner un nomvbre ente 1 et 10
		//Tant que l'utilisateur n'a pas deviné le bon nombre, écrire "perdu" puis dedemander à deviner.
		//quand l'utilisateur a deviné le bon nombre, ecrire gagné et quitter
		
		//v1.1
		//ecrire "gagné X coups"
		
		Scanner sc = new Scanner(System.in);
		
		int compteur = 0;
		for(;;) {
			int choixUtilisateur = sc.nextInt();
			compteur++;
		
			if(choixUtilisateur == nombreADEviner){
				System.out.println("Gagné en " + " " + compteur + " " + "coups");
				break;
			} else {
			System.out.println("Prdu !");
			System.out.println("Deviner un nombre entre 1 et 10 svp");
			}
		}

	}

}
