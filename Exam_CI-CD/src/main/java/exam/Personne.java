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

    public void donnerArgent(double argent) {
        if (argent > 0) {
            this.argent += argent;
        }
    }

    public boolean peutPayerFacture() {
        if(argent - facture > 0) {
            argent -= facture;
            facture = 0;
            return true;
        } else {
            System.out.println("Vous ne pouvez pas payer la facture, dépechez vous la banque va vous tomber dessus");
            return false;
        }
    }
}
