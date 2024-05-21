import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {

        // BufferedWriter;
        try {
            FileWriter write = new FileWriter("C:\\Users\\marco\\Downloads\\out\\texto.txt");
            BufferedWriter escritor = new BufferedWriter(null);

            escritor.write("Texto que será escrito");
            escritor.newLine();

            escritor.close();

        } catch (IOException e) {
            System.out.println("error ao escrever o arquivo");
            e.printStackTrace();
        }

    }
}
