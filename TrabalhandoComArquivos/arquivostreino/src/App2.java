import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {

        try {
            String text = "C:\\Users\\marco\\Downloads\\out\\texto.txt";
            FileWriter escritor = new FileWriter(text, true);
            PrintWriter saida = new PrintWriter(escritor);

            saida.println("texto que será escrito no arquivo");

            saida.close();
            escritor.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
