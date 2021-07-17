import java.io.File;
import java.util.Formatter;

class AnExtension {
    public static void theFile() {
        File x = new File("C:\\Users\\Stentechy\\MyFileReader.txt");
        if(x.exists()) {
            System.out.println(x.getName() + " exists! because Ozioma created one :wink:");
        }
        else {
            System.out.println("The file does not exist...");
            try {
                Formatter F = new Formatter("C:\\Users\\Stentechy\\MyFileReader.txt");
            } catch (Exception e) {
                System.out.println(e);
            }
            if(x.exists()) {
                System.out.println(x.getName() + " now exists, thanks to Ozioma. Check the folder! :wink:");
            }
        }
    }
    public static void writeToFile() {
        try {
            Formatter D = new Formatter("C:\\Users\\Stentechy\\MyFileReader.txt");
            D.format("%s %s", "1.", "OZIOMA CREATED THIS USING JAVA");
            D.format("\n%s %s", "2.", "Whatever you do in life, flex sometimes!");
            D.close();
            System.out.println("You've successfully created and written to a file, BABY!!!");
        } catch (Exception e) {
            System.out.println("Cannot write to file");
        }

    }
}

public class MyFileReader extends AnExtension{
    public static void main(String[] args) {
        theFile();
        writeToFile();
    }
}
