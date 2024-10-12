import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        File f = new File("<path-to>/monfichier.txt");

        try {
            FileInputStream in = new FileInputStream(f);
            int i = in.read();  // Lecture du premier caractère

            while (i != -1) {
                System.out.print((char) i);  // Conversion en caractère et affichage
                i = in.read();  // Lecture du caractère suivant
            }

            in.close();  // Fermeture du flux une fois la lecture terminée

        } catch (IOException e) {  // Gestion de l'exception IOException
            e.printStackTrace();  // Affichage de la pile d'exécution en cas d'erreur
        }
    }
}

