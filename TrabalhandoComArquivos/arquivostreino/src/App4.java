import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {

        try {
            FileWriter file = new FileWriter("C:\\Users\\marco\\Downloads\\out\\texto.txt", true);
            BufferedWriter escritor = new BufferedWriter(file);

            escritor.write("João pedro");
            escritor.newLine();

            escritor.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }

    }
}
