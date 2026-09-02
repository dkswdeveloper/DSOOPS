import java.util.ArrayList;
import java.util.List;
public class ListRemoveQuestion {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hot");
        list.add("java");
        list.add("great");
        list.add("good");
        list.add("education");
        list.add("string");
        removeWordsWithSingleVowelValue(list);
        for (String word : list)
            System.out.println(word + " ");
        // hot, java, good, string will be removed
        // good and java has 2 vowels but same
    }
}
