package main;

import java.util.Scanner;

public class Race {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		// int i = 0;
		int j;
		boolean aWinner = false;
		// int trajet = 100;
		int multiple;
		int rank = 1;
		int tour = 1;
		Voiture[] car = new Voiture[4];
		
		for(int a=0;a<4;a++) {
	           car[a] = new Voiture();
		}

	       // do {
	            do {       
	                for(j=0;j<4;j++) {
	                    System.out.println("[Tour: "+ tour + "] Entrer un chiffre entre 1 et 9 pour la voiture " + j + " : ");
	                    multiple = scan.nextInt();
	                    car[j].avancer(multiple);
	                    // System.out.println("La voiture " + j + " est à " + (car[j].trajetVoiture) + "km/100" );
	                    //System.out.println(car[j].trajetVoiture);
	                    System.out.println("La voiture " + j +  car[j].description());	                   
	                    if(car[j].trajetVoiture >= 100) {
	                    	aWinner = true;
	                    	System.out.println("La Voiture " + j + " Viens de terminer sa course à la place : " + rank);
	                    	rank ++;
	                    }
	                 
	                }		
	                tour++;
	            } while(aWinner == false);
	        //} while (aWinner == false);
	         //   System.out.println(car[j].description());
	    }
	}

