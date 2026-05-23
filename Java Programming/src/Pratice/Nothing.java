package Pratice;
import java.util.ArrayList;

// public class Nothing{

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4, 5};
//         for(int i = 0; i < nums.length; i++){
//             System.out.print("Excluding index " + i + ": ");
        
//             for(int j = 0; j < nums.length; j++){
//                 if(j == i) continue;
        
//                 System.out.print(nums[j] + " ");
//             }
        
//             System.out.println();
//         }
//     }
// }


//writing a progam for arraylist methods
public class Nothing{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(2, 10);
        System.out.println(list);
        list.set(3, 20);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
