package exam;

public abstract class Vehicule {
    Personne proprietaire;
    int nbRoue;
    int nbLitreMax;
    int quantiteEssence;
    TypeEssence typeEssence;
    String modele;

    public Vehicule(Personne proprietaire, int nbRoue, String modele, TypeEssence typeEssence, int nbLitreMax, int quantiteEssence) {
        this.proprietaire = proprietaire;
        this.modele = modele;
        this.nbRoue = nbRoue;
        this.typeEssence = typeEssence;
        this.nbLitreMax = nbLitreMax;
        this.quantiteEssence = quantiteEssence;
    }

    public void remplirEssence() {
        quantiteEssence = nbLitreMax;

        proprietaire.facture = nbLitreMax * typeEssence.prix;
    }

    public void remplirEssence(int quantity) {
        if(quantiteEssence + quantity > nbLitreMax) {
            quantiteEssence = nbLitreMax;
        } else {
            this.quantiteEssence += quantity;
        }

        proprietaire.facture = quantity * typeEssence.prix;
    }
    public boolean peutRouler() {
        if(quantiteEssence > 0 && proprietaire.facture == 0) {
            System.out.println("La voiture elle peut rouler là");
            return true;
        } else {
            System.out.println("La voiture elle ne peut pas rouler là, faut faire quelque chose là");
            return false;
        }
    }

}
