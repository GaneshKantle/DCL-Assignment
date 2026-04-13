package Collections;

import java.util.HashMap;

public class FreqUsingKeySet {
    public static void main(String[] args) {

        int[] arr = {10, 10, 30, 10, 20, 30, 10};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : map.keySet()) {
            System.out.println(key+" "+map.get(key));
        }
        System.out.println(map);
    }
}
