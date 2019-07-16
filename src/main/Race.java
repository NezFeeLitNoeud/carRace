package main;

import java.util.Scanner;

public class Race {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int j;
		boolean aWinner = false;
		int multiple;
		int rank = 1;
		int tour = 1;
		Voiture[] car = new Voiture[4];
		
		for(int a=0;a<4;a++) {
			car[a] = new Voiture();
		}
		car[0].retourne();
		car[0].noReturn();
		
		
		
		try {		
			do {  
				for(j=0;j<4;j++) {
					System.out.println("[Tour: "+ tour + "] Entrer un chiffre entre 1 et 9 pour la voiture " + j + " : ");
					multiple = scan.nextInt();		                    
					car[j].avancer(multiple);
					System.out.println("La voiture "+ j +  car[j].description());
					
		                
					if(car[j].essenceVoiture < 40) {
						car[j].plein();
					} // FIN DU IF ESSENCE < 40
                 
					if(car[j].trajetVoiture >= 100) {
						aWinner = true;
						System.out.println("La Voiture Viens de terminer sa course à la place : " + rank);
						rank++;
					} // FIN DU IF TRAJET > 100	                 
				} // FIN DU FOR
	        tour++;	     
			} while(aWinner == false); // FIN DU WHILE   
		} catch (Exception e) {
			scan.nextLine();
	    	System.out.println("Une erreur est survenu. \nVoulez-vous en savoir plus ? Y/N ");	
	    	char answer = scan.nextLine().charAt(0);
	    	char upper = Character.toUpperCase(answer);
	    	
	    	if(upper == 'Y') {
	    		System.out.print("Vous n'avez pas rentré de chiffre. Relancer le programme en répondant avec un chiffre");
	    	} else {
	    		System.out.println("Dommage pour toi.");
	    	}
	    }
	} // FIN DE LA METHODE MAIN
} // FIN DE LA CLASS

