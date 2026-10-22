/*
Read n, number of students
Read n lines containing name:marks for each student.
Print the name of the student who has maximum marks.
If the marks or name of some student is missing, throw an exception InputMismatchException
Example :
5
A:44
B:33
C:45
D:34
E:38
C
 
4
A:44
B:
C:45
D:34
InputMismatchException
*/
import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentDataException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // ignore the blank line
        int max = Integer.MIN_VALUE;
        String maxName = null;
        for (int i = 0; i < n; i++) {
            String data = sc.nextLine();
            int index = data.indexOf(":");
            if (index == -1 || index == 0) {
                throw new InputMismatchException();
            }
            String name = data.substring(0, index).trim();
            String marks = data.substring(index + 1).trim();
            if (name.isEmpty() || marks.isEmpty()) {
                throw new InputMismatchException();
            }
            Integer m = Integer.parseInt(marks);
            if (m > max) {
                max = m;
                maxName = name;
            }
        }
        System.out.println(maxName);
    }
}
