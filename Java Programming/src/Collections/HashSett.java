package Collections;

import java.util.*;


public class HashSett {
    static Set<Passengerr> set = new HashSet<>();

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the ID of an Passenger: ");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            Passengerr p = new Passengerr(id);

            if (set.contains(p)) {
                System.out.println("Already Present, Enter Different ID");
            } else {
                System.out.println(p.hashCode());
                set.add(p);
            }
        }
        System.out.println(set);
    }
}
