package exam;

public class Personne {
    String nom;
    String prenom;
    double facture;
    double argent;

    public Personne(String nom, String prenom, double argent) {
        this.nom = nom;
        this.prenom = prenom;
        this.argent = argent;
        this.facture = 0;
    }

    public void payerFacture() {
        if(argent - facture > 0) {
            argent -= facture;
            facture = 0;
        } else {
            System.out.println("Vous ne pouvez pas payer la facture, dépechez vous la banque va vous tomber dessus");
        }
    }
}
