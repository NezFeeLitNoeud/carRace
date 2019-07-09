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
		//winner = false;
	}
	
	/*public Voiture(String couleur, int vitesse) {
		couleurVoiture = couleur;
		vitesseVoiture = vitesse;
		essenceVoiture = 40;
		trajetVoiture = 0;
	}*/
	
 public String description() {

		return " à une vitesse de : " + this.vitesseVoiture + "km/h. Elle à actuellement " + this.essenceVoiture + "L d'essence dans sont réservoir et elle à parcourue : " + this.trajetVoiture + "km sur 100km";
	}
	
	public String avancer(int multiplicateur) {
		int go = multiplicateur * this.vitesseVoiture;
		trajetVoiture += go;
		// System.out.println(trajetVoiture);
		essenceVoiture -= go;
		// System.out.println(essenceVoiture);
		
		
		//essenceVoiture = (essenceVoiture - go) + surplus;
	
		if(this.essenceVoiture <= 0) {
			 System.out.println("Le conducteur n'a plus d'essence dans sa voiture \nHeureusement sont equipe lui remplis le reservoir en attendant le prochain tour !");
			 
			//  int surplus = essenceVoiture + go;
			//  System.out.println("surplus : " + surplus);
			 
			// trajetVoiture = (trajetVoiture + go) - surplus ;
			// System.out.println("trajet avec essecne < 40 : " + trajetVoiture);
			essenceVoiture = 40;
		}
		
		return "La voiture est à " + this.trajetVoiture + "km sur 100km \n il lui reste " + this.essenceVoiture + " dans le reservoire";
	}
}
