package Collections;

import java.util.HashMap;
import java.util.*;


//public class FreqUsingKeySet {
//    public static void main(String[] args) {
//
//        int[] arr = {10, 10, 30, 10, 20, 30, 10};
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int key : map.keySet()) {
//            System.out.println(key+" "+map.get(key));
//        }
//        System.out.println(map);
//    }
//}

public class FreqUsingKeySet {
        public static int[] topKFrequent(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int key: nums){
                if(map.containsKey(key)){
                    int count = map.get(key)+1;
                    map.put(key, count);
                }
                else{
                    map.put(key,1);
                }
            }
// Returns the maximum value in the map
            int maxValue = Collections.max(map.values());

            return new int[]{maxValue};
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 30, 10, 20, 30, 10};
        int[] result = topKFrequent(arr);
    }
}
