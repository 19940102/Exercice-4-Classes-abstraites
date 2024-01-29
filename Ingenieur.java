public  class  Ingenieur extends Employe {

    private String specialité;

    public Ingenieur(String n1, String p1, String mail, String number) {
    }

    public Ingenieur(String specialité) {
        this.specialité = specialité;
    }

    @Override
    public double calculerSalaire() {
        return salaire+salaire*0.15;
    }

    @Override
    public String toString() {
        return super.toString()+" specialité='" + specialité ;
    }

}

