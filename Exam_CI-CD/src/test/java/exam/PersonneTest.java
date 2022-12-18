package exam;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonneTest {

    @Test
    public void Personne() {
        Personne personne = new Personne("leNom", "lePrenom", 100.50);
        assertEquals("leNom", personne.nom);
        assertEquals("lePrenom", personne.prenom);
        assertEquals(100.50, personne.argent, 0);
    }

    @Test
    public void donnerArgent() {
        Personne personne = new Personne("leNom", "lePrenom", 100.50);
        personne.donnerArgent(100);

        assertEquals(200.50, personne.argent, 0);
    }

    @Test
    public void peutPayerFacture() {
        Personne personne = new Personne("leNom", "lePrenom", 10);
        Voiture voiture = new Voiture(personne, 4, "laVoiture", 4, 4, TypeEssence.E85, 100);
        voiture.remplirEssence();

        assertEquals(TypeEssence.E85.prix * voiture.nbLitreMax, personne.facture, 0);
        assertFalse(personne.peutPayerFacture());

    }
}