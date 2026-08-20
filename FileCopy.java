import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopy {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // copy of a file : text/binary
        // text file : manipulation
        // binary : no manipulation
        FileInputStream fin = new FileInputStream("D:/dinesh/dinesh/javaprogs/chitkara26/FaxAlgo.java");
        FileOutputStream fout = new FileOutputStream("D:/dinesh/dinesh/javaprogs/chitkara26/FaxAlgoCopy.java");
        int ch = 0;
        while (ch != -1) {
            ch = fin.read();
            if (ch == -1)
                break;
            fout.write(ch);
        }
        fin.close();
        fout.close();
        System.out.println("File Copied");
    }
}
