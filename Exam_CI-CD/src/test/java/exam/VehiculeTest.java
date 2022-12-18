package exam;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehiculeTest {

    @Test
    public void Vehicule() {
        Personne personne = new Personne("leNom", "lePrenom", 10);
        Moto moto = new Moto(personne, 2, "laMoto", TypeEssence.SP98, 100, true);
        assertEquals(personne, moto.proprietaire);
        assertEquals(2, moto.nbRoue);
        assertEquals("laMoto", moto.modele);
        assertEquals(TypeEssence.SP98, moto.typeEssence);
        assertEquals(100, moto.nbLitreMax);
        assertTrue(moto.hasTopBag);
    }

    @Test
    public void remplirEssence() {
        Personne personne = new Personne("leNom", "lePrenom", 10);
        Voiture voiture = new Voiture(personne, 4, "laVoiture", 4, 4, TypeEssence.E85, 100);
        voiture.remplirEssence();

        assertEquals(TypeEssence.E85.prix * voiture.nbLitreMax, personne.facture, 0);
        assertEquals(100, voiture.quantiteEssence);
    }

    @Test
    public void peutRouler() {
        Personne personne = new Personne("leNom", "lePrenom", 10);
        Voiture voiture = new Voiture(personne, 4, "laVoiture", 4, 4, TypeEssence.E85, 100);

        assertFalse(voiture.peutRouler());

        voiture.remplirEssence();

        assertFalse(voiture.peutRouler());

        personne.donnerArgent(200);
        personne.peutPayerFacture();

        assertTrue(voiture.peutRouler());
    }
}