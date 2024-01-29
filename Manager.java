public class  Manager extends Employe{
    public  String service;

    public Manager() {
    }
    public Manager(String nom, String prenom, String email, String tel, double salaire, String service) {
        super(nom, prenom, email, tel, salaire);
        this.service = service;
    }
    @Override
    public java.lang.String calculerSalaire() {
        return salaire+salaire*0.25;
    }
    @Override
    public String toString() {
        return super.toString() + "service=" + service ;

    }
}
