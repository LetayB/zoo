package zoo;

import zoo.animal.Chat;
import zoo.animal.TypeAnimal;
import zoo.exception.AnimalDansMauvaisSecteurException;

public class App {
  public static void main(String[] args) throws AnimalDansMauvaisSecteurException {
      Zoo zoo = new Zoo();
      
		  zoo.ajouterSecteur(TypeAnimal.CHAT);
		  zoo.ajouterSecteur(TypeAnimal.CHIEN);
		  zoo.ajouterSecteur(TypeAnimal.CHAT);
	  	zoo.ajouterSecteur(TypeAnimal.CHIEN);
      zoo.ajouterSecteur(TypeAnimal.CHIEN);
      
      zoo.nouvelAnimal(new Chat("Felix"));
      zoo.nouvelAnimal(new Chat("Chaton"));
      zoo.nouvelAnimal(new Chat("Malot"));
      zoo.nouvelAnimal(new Chat("Griffe"));
      zoo.nouvelAnimal(new Chat("LeChat"));
      zoo.nouvelAnimal(new Chat("Truc"));

      System.out.println(zoo.nombreAnimaux());
	  }
}
