package exam;

public enum TypeEssence {

    SP95(1.81),
    SP95_E10(1.73),
    SP98(1.84),
    E85(1.65);
    final double prix;

    TypeEssence(double prix) { this.prix = prix ;}
}
