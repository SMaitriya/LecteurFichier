import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileCsv extends FileType{

    public FileCsv(String FilePath) {
        super(FilePath);
    }

    public void readFile() {
        openFile();

        System.out.println("Reading a .CSV file...");

        closeFile();

    }

    @Override
    public void readFileReversed() {
        File file = new File(FilePath);
        try (FileInputStream in = new FileInputStream(file)) {
            // Utilisation d'un StringBuilder pour stocker le contenu
            StringBuilder content = new StringBuilder();
            int i;
            while ((i = in.read()) != -1) {
                content.append((char) i); // Construit le contenu
            }
            // Affiche le contenu à l'envers
            System.out.println(content.reverse().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
