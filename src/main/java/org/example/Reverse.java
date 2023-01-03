package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Reverse {
    public static<T> List<T> reverseList(List<T> list)
    {
        // Making a copy and flipping
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }
}
