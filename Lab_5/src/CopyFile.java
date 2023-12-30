import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void copyFile(String file1, String file2) {
        try {
            FileReader reader = new FileReader(file1);
            FileWriter writer = new FileWriter(file2);

            int c;
            while((c = reader.read()) != -1) {
                writer.write(c);
            }

            writer.close();
            reader.close();
            // writer.write("EXTRA");

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
