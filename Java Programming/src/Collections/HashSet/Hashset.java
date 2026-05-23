package Collections.HashSet;

import java.util.*;

public class Hashset {

    static ArrayList<Integer> seatingList = new ArrayList<Integer>();
    static Set<Integer> bookingStatus = new HashSet<>();
    static ArrayList<Integer> waitingList = new ArrayList<Integer>();

    public static void main(String[] args) {
//            System.out.println("Enter the Name");

        for (int i = 1; i <= 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the ID: ");
            int id = sc.nextInt();
            System.out.print("Enter the Name: ");
            String name = sc.next();
            Customerr c = new Customerr(name, id);
            if (bookingStatus.contains(c.id)) {
                System.out.println("Already Booked");
            } else {
                bookingStatus.add(c.id);

                if (seatingList.size() < 5) {
                    seatingList.add(c.id);
                    System.out.println("You have been added to the Seating List");
//                    System.out.println("Seating Number is: " + seatingList.size());
                } else {
                    if (waitingList.contains(c.id)) {
                        System.out.println("You are already in the Waiting List");
                    } else {
                        waitingList.add(c.id);
                        System.out.println("You have been added to the Waiting List");
                    }
                }
            }
        }

        System.out.print(seatingList);
    }
}
