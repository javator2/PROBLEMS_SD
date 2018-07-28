package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problems {
    public static String last(List<String> strings) {
        return strings.get(strings.size() -1);

    }

    public static Integer secondLast(List<Integer> numbers) {
        return numbers.get(numbers.size() - 2);
    }

    public static int length(List<Object> objects) {
        return objects.size();
    }

    public static List<Integer> reverse(List<Integer> numbers) {
        Collections.reverse(numbers);
        return numbers;
    }

}
