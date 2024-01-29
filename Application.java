public class Application{

    public static void main(String[] args) {
        Employe e1= new Ingenieur("n1","p1","n1@gmail.com","01256");
        System.out.println(e1.calculerSalaire());

        Employe e2=new  Manager("n2","p2","n2@gmail.com","1265852");

        System.out.println(e2.calculerSalaire());
    }



}
