package part11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        Integer[] integerArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> integerList = Arrays.asList(integerArray);

        System.out.println(integerList);

        List<Integer> integers = List.of(1,1,11,5,3,5,4,8,9,6);
        System.out.println(integers);


    }
}
