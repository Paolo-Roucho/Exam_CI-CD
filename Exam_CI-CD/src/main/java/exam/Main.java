package exam;

public class Main {
    public static void main(String args[])
    {
        Personne proF1 = new Personne("Pierre", "Gasly", 1000);
        Personne motar = new Personne("Thibault", "Barral", 1.50);

        Moto moto = new Moto(motar, 2, "Ducati", TypeEssence.E85, 40, true);
        Voiture voiture = new Voiture(proF1, 4,"Mercedes", 4, 4, TypeEssence.SP95_E10, 220);

        moto.remplirEssence();
        voiture.remplirEssence(110);

        proF1.peutPayerFacture();
        motar.peutPayerFacture();

        voiture.peutRouler();
        moto.peutRouler();
    }
}