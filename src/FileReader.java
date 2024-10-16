
public class FileReader {
    public static void main(String[] args) {

        String filePath =  "src/texte.txt";   // EXEMPLE avec .txt
       // String filePath = "src/message.json"; // EXEMPLE avec .Json
        FileType file = FileType.getFileReader(filePath);

        if (file != null) {
            file.openFile();

            String content = file.readFile();

            if (content != null) {
                System.out.println("Contenu du fichier :");

                // LIRE

                System.out.println(content);

                 // REVERSE

                 //file.readFileReversed();

                // PALINDROMIC

                // file.readFilePalindromic();

            } else {
                System.out.println("pas de contenu");
            }

            file.closeFile();
        } else {
            System.out.println("Impossible d'ouvrir le fichier.");
        }


        // COMPARER
        FileType file1 = FileType.getFileReader("src/texte.txt");
        FileType file2 = FileType.getFileReader("src/message.json");

        if (file1 != null && file2 != null) {
            if (file1.compareFiles(file2)) {
                System.out.println("Les fichiers ont le même contenu.");
            } else {
                System.out.println("Les fichiers ont des contenus différents.");
            }
        } else {
            System.out.println("Erreur lors de l'ouverture des fichiers.");
        }
    }

}