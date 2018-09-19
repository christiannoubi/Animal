public class Main {

    public static void main(String[] args) {
        System.out.println("Salut les programmeurs en Java");
        System.out.println("Exercices sur l'heritage, Interface et polymorphisme\n\n");


        // Les methodes du Loup
        System.out.println("Salut je suis un loup");
        Loup l = new Loup("Gris bleuté", 20);
        l.boire();
        l.manger();
        l.deplacement();
        l.crier();
        System.out.println(l.toString());
        System.out.println("-----------------------------------------------");

        // Les methodes du Chien
        System.out.println("Salut je suis un Chien");
        Chien c = new Chien("Gris Bleuté ",30);
        c.boire();
        c.deplacement();
        c.crier();
        System.out.println(c.toString());

        System.out.println("-----------------------------------------------");

        // Les methodes du Lion
        System.out.println("Salut je suis un Lion");
        Lion li = new Lion("Gris or ",150);
        li.boire();
        li.deplacement();
        li.crier();
        System.out.println(li.toString());
        System.out.println("-----------------------------------------------");

        // Les Méthodes de l'Interface
        System.out.println("Les Méthodes de l' Interface");
        c.faireLeBeau();
        c.faireCalin();
        c.faireLechouille();

        // Utilisons le polymorphisme de notre Interface
        System.out.println("-----------------------------------------------");
        System.out.println("Polymorphisme de l'Interface");
        Rintintin r= new Chien();
        r.faireLeBeau();
        r.faireCalin();
        r.faireLechouille();
    }
}
