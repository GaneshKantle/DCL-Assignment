package Collections;

import java.util.HashMap;

public class KeySet {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 20, 30, 10, 20};
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(map);
        for(int key:arr ) {
            if(map.containsKey(key) == true){
                map.put(key, map.get(key)+1);
            }
            else{
                map.put(key, 1);
            }
        }
        System.out.println(map);

        for(int key:map.keySet()){
            System.out.println(key);
        }

    }
}


//Write a program to print all the duplicates elements in the array
//Write a program to print only non duplicates from the given array
//Write a program to remove all the duplicates elements from the given array
//Hacker Rank Migratory Birds