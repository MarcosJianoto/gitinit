import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercice {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        String sourceFileStr = "C:\\Users\\marco\\Downloads\\files.txt";

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        System.out.println("Folder created: " + success);

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (){
            
        }catch(IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }


        sc.close();

    }
}
