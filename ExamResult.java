import java.util.Arrays;

class MarksDetails 
{
    int roll;
    String name;
    int[] marks;
    public MarksDetails(int roll, String name, int[] marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Exam [roll=" + roll + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
    }
    
}
class Result 
{
    int roll;
    String name;
    String cgpa; // should be cgpa or reappear-1
    public Result(int roll, String name, String cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
    @Override
    public String toString() {
        return "Result [roll=" + roll + ", name=" + name + ", cgpa=" + cgpa + "]";
    }
    


}
public class ExamResult {
    public static void main(String[] args) {
        MarksDetails marksDetails = new MarksDetails(123, "Sachin", new int[]{34,67,89,76});
        Result result = getResult(marksDetails);
        System.out.println(result);
    }

    private static Result getResult(MarksDetails marksDetails) {
        // constructor which initializes the data 
        // setter function result.setName(exam.name); result.setCgpa("5.6")
        double s = 0.0;
        for(int x : marksDetails.marks)
        {            s = s + x;        }
        double avg = s/marksDetails.marks.length;
        double cgpa = avg/10;
        int roll = marksDetails.roll;
        String name= marksDetails.name;
        Result result = new Result(roll, name, ""+cgpa);
        return result;

    }
}
