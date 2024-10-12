
public class FileReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\maitr\\Desktop\\sorbonne\\testjava.txt";
        FileType file = FileType.getFileReader(filePath);
        if (file != null) {
            file.readFileReversed();
        } else {
            System.out.println("Unsupported file type.");
        }
    }
    }