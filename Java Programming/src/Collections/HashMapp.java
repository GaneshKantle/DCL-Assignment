package Collections;
import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
        int[] arr = {10,10,30,10,20,30,10};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key: arr){
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        System.out.println(map);
    }
}


