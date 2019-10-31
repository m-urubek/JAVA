import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class Soubory {
    public static File randomBytesToFile(int count) {
        File myFile = new File("nahodna_cisla.txt");
        try {
            if (!myFile.createNewFile()) {
                myFile.delete();
                myFile.createNewFile();
            }
        } catch (Exception e) {
            System.out.println("ERROR - Couldn't create a new file");
            myFile = null;
        }
        try {
            FileOutputStream writer = new FileOutputStream(myFile);
            byte[] bytes = new byte[count];
            new Random().nextBytes(bytes);
            writer.write(bytes);
            writer.close();
        } catch (Exception e) {
            System.out.println("Error during file write");
            myFile = null;
        }
        return myFile;
    }

    public static void daysOfWeek() {
        try {
            FileWriter writer = new FileWriter(System.getProperty("user.home") + "\\dnyVtydnu.txt");
            writer.write("Pondeli");
            writer.write("Utery");
            writer.write("Streda");
            writer.write("Ctvrtek");
            writer.write("Patek");
            writer.write("Sobota");
            writer.write("Nedele");
            writer.close();
        } catch (Exception ex) {
            System.out.println("Error during file write");
        }
    }
}
