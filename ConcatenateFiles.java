import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ConcatenateFiles {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("file1.txt");
            FileOutputStream fout = new FileOutputStream("file2.txt", true);
            int ch = 0;
            while (ch != -1) {
                ch = fin.read();
                if (ch != -1)
                    fout.write(ch);
            }
            fout.close();
            fin.close();
            System.out.println("File Concatenated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
