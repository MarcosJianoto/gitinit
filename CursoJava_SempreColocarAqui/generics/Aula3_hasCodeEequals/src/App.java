import entities.Client;

public class App {
    public static void main(String[] args) throws Exception {

        // hashCode e equals
        // equals é lento mas nao erra, hashCode tem peossibilidade de dar falso
        // positivo.. doideira..
        Client c1 = new Client("Maria", "maria@gmai.com");
        Client c2 = new Client("Maria", "maria@gmai.com");

        String s1 = new String("teste");
        String s2 = "teste";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
