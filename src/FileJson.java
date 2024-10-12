import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileJson extends FileType {

    public FileJson(String filePath) {
        super(filePath);
    }


    @Override
    public void readFile() {
        File file = new File(FilePath); // Utilise filePath au lieu de FilePath

        try (FileInputStream in = new FileInputStream(file)) { // Utilisation de try-with-resources
            int i;
            // Lecture du fichier caractère par caractère
            while ((i = in.read()) != -1) { // Lire jusqu'à la fin du fichier
                System.out.print((char) i); // Affiche le caractère lu
            }
            System.out.println(); // Pour passer à la ligne après l'affichage complet

        } catch (IOException e) {
            e.printStackTrace(); // Gérer les exceptions
        } finally {
            closeFile(); // Appeler la méthode pour fermer le fichier
        }
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
