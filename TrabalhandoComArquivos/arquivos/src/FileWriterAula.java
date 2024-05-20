import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAula {
    public static void main(String[] args) throws Exception {

        String[] lines = new String[] { "good morning", "good afternoon", "good night" };

        String path = "C:\\Users\\marco\\Downloads\\joao.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
