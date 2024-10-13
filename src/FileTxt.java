import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileTxt extends FileType{


    public FileTxt(String FilePath){
        super(FilePath);
    }



    @Override
    public String readFile() {
        StringBuilder content = new StringBuilder();
        File file = new File(FilePath);

        try (FileInputStream in = new FileInputStream(file)) {
            int i;
            while ((i = in.read()) != -1) {
                content.append((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            closeFile();
        }
        return content.toString().trim();
    }


    @Override
    public void readFileReversed() {
        File file = new File(FilePath);
        try (FileInputStream in = new FileInputStream(file)) {
            StringBuilder content = new StringBuilder();
            int i;
            while ((i = in.read()) != -1) {
                content.append((char) i);
            }

            String[] lines = content.toString().split("\n");

            for (int j = lines.length - 1; j >= 0; j--) {
                System.out.println(lines[j]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFilePalindromic() {
        File file = new File(FilePath);
        try (FileInputStream in = new FileInputStream(file)) {
            StringBuilder content = new StringBuilder();
            int i;
            while ((i = in.read()) != -1) {
                content.append((char) i);
            }
            System.out.println(content.reverse().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}