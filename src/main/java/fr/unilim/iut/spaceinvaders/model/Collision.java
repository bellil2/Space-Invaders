package fr.unilim.iut.spaceinvaders.model;

public class Collision {

	public boolean DetecterCollision(Envahisseur envahisseur, Missile missile) {
		boolean reponse = false ;
		if(envahisseur.ordonneeLaPlusBasse()<=missile.ordonneeLaPlusHaute()) {
			reponse=true;
		}
		if(envahisseur.abscisseLaPlusAGauche()<=missile.abscisseLaPlusADroite()) {
			reponse=true;
		}
		if(envahisseur.abscisseLaPlusADroite()>=missile.abscisseLaPlusAGauche()) {
			reponse=true;
		}
		return reponse;
	}
	

}
