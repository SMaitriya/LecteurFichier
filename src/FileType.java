public  abstract class FileType implements InterfaceReader{

    protected String FilePath;
    public abstract String readFile();
    public abstract void readFileReversed();
    public abstract void readFilePalindromic();


    public FileType(String FilePath) {
        this.FilePath = FilePath;
    }


    @Override
    public  void openFile() {
        System.out.println("Overture du fichier...");


    }

    public  void closeFile() {
        System.out.println("Fermeture du fichier...");

    }


    static FileType getFileReader(String filePath) {
        if (filePath.endsWith(".txt")) {
            return new FileTxt(filePath);
        } else if (filePath.endsWith(".csv")) {
            return new FileCsv(filePath); //
        } else if (filePath.endsWith(".json")) {
            return new FileJson(filePath);
        } else {
            return null;
        }
    }


    public boolean compareFiles(FileType other) {
        String thisContent = this.readFile();
        String otherContent = other.readFile();

        if (thisContent == null || otherContent == null) {
            System.out.println("Erreur : l'un des fichiers n'a pas pu être lu.");
            return false;
        }

        return thisContent.equals(otherContent);
    }



}
