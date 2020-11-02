package zoo;

import java.util.ArrayList;
import java.util.List;

import zoo.animal.TypeAnimal;

public class Zoo {
	

	private final int NB_MAX_VISITEUR_PAR_SECTEUR = 15;
	
	private int visiteurs;
	private List<Secteur> secteursAnimaux;
	
	public Zoo() {
		visiteurs = 0;
		secteursAnimaux = new ArrayList<Secteur>();
	}
	
	public void ajouterSecteur(TypeAnimal type){
		secteursAnimaux.add(new Secteur(type));
	}
	
	public void nouveauVisiteur() {
		visiteurs += 1;
	}
	
	public int getLimiteVisiteur() {
		return NB_MAX_VISITEUR_PAR_SECTEUR * secteursAnimaux.size();
	}
	
//	public nouvelAnimal(Animal a) {
//		
//	}
	
	public int nombreAnimaux() {
		return secteursAnimaux.stream().mapToInt(x->x.getNombreAnimaux()).sum();
	}
}
