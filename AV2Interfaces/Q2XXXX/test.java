package AV2Interfaces.Q2XXXX;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ByTwos series1 = new ByTwos();
        ArrayList<String> friends = new ArrayList<>(Arrays.asList("Davi", "Macedo", "Silva"));
        System.out.println(friends.get(2));
        for (int i = 0; i < 9; i++) {
            System.out.println(series1.getNext());
        }
    }
}
