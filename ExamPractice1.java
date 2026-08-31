import java.util.ArrayList;
import java.util.List;
public class ExamPractice1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        // QUESTION 1
        swapPairs(list); // function swaps 1st element with 2nd, 3rd with 4th
        // and so on (for odd number of elements last element is as it is)
        // after the function if i print the list, answer must be :
        // two one four three siz five seven
        for (String word : list)
            System.out.println(word + " ");
        list.add("two");
        list.add("three");
        list.add("four");
        List<String> repeatedList = getRepeatedWords(list);
        // Write a function that returns the repeated words
        // If no word found, returns NullPointerException with
        // message "No repeated Word"
        for (String word : repeatedList)
            System.out.println(word);
        // Test 2
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        try {
            List<String> repeats = getRepeatedWords(list);
            for (String word : repeatedList)
                System.out.println(word);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}