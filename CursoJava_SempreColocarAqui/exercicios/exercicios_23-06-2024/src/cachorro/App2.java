package cachorro;

import java.util.Locale;
import java.util.Scanner;

import cachorro.entities.Cachorro;
import cachorro.entities.Color;

public class App2 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Cachorro cachorro = new Cachorro("Dog", "raça", 5, new Color("black"));

        System.out.println(cachorro);

        sc.close();

    }
}
