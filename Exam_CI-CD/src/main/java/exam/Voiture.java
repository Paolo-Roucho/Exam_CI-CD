package exam;

public class Voiture extends Vehicule {
    int nbPlace;
    int nbPorte;

    public Voiture(Personne proprietaire, int nbRoue, String modele, int nbPlace, int nbPorte, TypeEssence typeEssence, int nbLitreMax) {
        super(proprietaire, nbRoue, modele, typeEssence, nbLitreMax, 0);
        this.nbPlace = nbPlace;
        this.nbPorte = nbPorte;
    }
}
