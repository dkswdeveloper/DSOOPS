import java.io.FileReader;
import java.io.FileWriter;
public class FileCopyChar {
    public static void main(String[] args) {
        try {
            FileReader fin = new FileReader("D:/dinesh/dinesh/javaprogs/chitkara26/FaxAlgo.java");
            FileWriter fout = new FileWriter("D:/dinesh/dinesh/javaprogs/chitkara26/FaxAlgo2.java");
            try {
                int ch = 0;
                while (ch != -1) {
                    ch = fin.read();
                    if (ch == -1)
                        break;
                    fout.write(ch);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                fin.close();
                fout.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("File Copied");
    }
}
/*
 * hello how r you? 
* fine, thanks 
* it is a rainy day 
* hot as well
 */
/*
 * hello 
* fine, thanks 
* hot as well
 */
