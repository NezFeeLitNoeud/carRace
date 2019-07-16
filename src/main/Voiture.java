package main;

public class Voiture {
	String couleurVoiture;
	int vitesseVoiture;
	int essenceVoiture;
	int trajetVoiture;

	
	public Voiture() {
		System.out.println("Création d'une voiture par défaut");
		vitesseVoiture = 10;
		essenceVoiture = 40;
		trajetVoiture = 0;
	}
	
	public String description() {
		return " à une vitesse de : " + this.vitesseVoiture + "km/h. Il lui reste " + this.essenceVoiture + "L d'essence et elle à parcourue : " + this.trajetVoiture + "km sur 100km";
	}
	
 
	public void avancer(int multiplicateur) {
		int go = multiplicateur * this.vitesseVoiture;
		trajetVoiture += go;
		essenceVoiture -= go;
		
		if(this.essenceVoiture < 0) {
			System.out.println("Le réservoir de la voiture n'étant que de 40L, elle n'a malheureusement pas pu parcourir les " + go + " km ");
			int mult = multiplicateur * this.vitesseVoiture;
			this.trajetVoiture += 40 - mult;
			this.essenceVoiture = 0;
			}
		}

	public void stop() {
		if(this.essenceVoiture <= 0) {
			System.out.println("La voiture n'a plus d'essence : Methode STOP");
		}
	}
	
	public void plein() {
		if(this.essenceVoiture <= 0) {
			System.out.println("La voiture n'a plus d'essence \nSon équipe lui refais le pleins !");
			this.essenceVoiture = 40;
		}
	}
	
	public String retourne() {
		return "Methode avec retour";
	}
	
	public void noReturn() {
		System.out.println("Pas de retour de méthode. méthode vide");
	}
}
