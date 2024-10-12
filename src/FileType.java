public  abstract class FileType implements InterfaceReader{

    protected String FilePath;
    public abstract void readFile();
    public abstract void readFileReversed();



    public FileType(String FilePath) {
        this.FilePath = FilePath;
    }



    @Override
    public void openFile() {
        System.out.println("Opening file...");


    }

    public void closeFile() {
        System.out.println("Closing file...");


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


}
