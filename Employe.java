public abstract  class Employe {

    private  String nom;
    private  String prenom;
    private  String email;
    private  String tel;
    protected double salaire;
    public Employe() {
    }

    public Employe(String nom, String prenom, String email, String tel, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.salaire = salaire;
    }
    public  abstract double calculerSalaire();



   @Override
    public String toString() {
        return
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", salaire=" + salaire;

    }
}


