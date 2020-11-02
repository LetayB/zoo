package zoo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;

import junit.framework.TestCase;
import zoo.animal.TypeAnimal;
import zoo.exception.LimiteVisiteurException;

public class TestApp {
	
	@Test
	public void testNbVisiteurOK() {
		Zoo zoo = new Zoo();
		zoo.ajouterSecteur(TypeAnimal.CHAT);
		Throwable e = null;
		
		try{
			addVisiteur(zoo, 14);
		}
		catch(Throwable ex) {
			e = ex;
		}
		
		assertFalse(e instanceof LimiteVisiteurException);
		
	}
	
	
	@Test
	public void testNbVisiteurKO() {
		Zoo zoo = new Zoo();
		zoo.ajouterSecteur(TypeAnimal.CHAT);
		Throwable e = null;
		
		try{
			addVisiteur(zoo, 18);
		}
		catch(Throwable ex) {
			e = ex;
		}
		
		assertTrue(e instanceof LimiteVisiteurException);
		
	}
	
	private void addVisiteur(Zoo zoo, int max) throws LimiteVisiteurException {
		for(int i = 0; i < max; i ++) {
			zoo.nouveauVisiteur();
		}
	}
}
