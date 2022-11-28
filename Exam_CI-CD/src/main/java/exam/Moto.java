package exam;

public class Moto extends Vehicule {

    Boolean hasTopBag;

    public Moto(Personne proprietaire, int nbRoue, String modele, TypeEssence typeEssence, int nbLitreMax, Boolean hasTopBag) {
        super(proprietaire, nbRoue, modele, typeEssence, nbLitreMax, 0);
        this.hasTopBag = hasTopBag;
    }
}
