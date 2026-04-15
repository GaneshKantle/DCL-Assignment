package Collections;

import java.util.ArrayList;

public class Threebus {
    public static void main(String[] args) {
        ArrayList<String> p = new ArrayList<>();
        ArrayList<Travel> t1 = new ArrayList<>();
        ArrayList<Travel> t2 = new ArrayList<>();
        ArrayList<Travel> t3 = new ArrayList<>();

//        t1.add(new Travel("Bangalore"));
//        t1.add(new Travel("Bangalore"));
        p.add("Ganesh");
        p.add("Rukmini");
        p.add("Samantha");

        int t1Cap = 0;
        int t2Cap = 0;
        int t3Cap = 0;
        for(int i=1; i<=p.size(); i++){
            if(t1.get(i).j_type.equals("Bangalore") && t1Cap<=3){
                t1.add((t1.get(i)));
                t1Cap++;
            }else if(t2.get(i).j_type.equals("Chennai") && t2Cap<=3){
                t2Cap++;
            }
            else if(t3.get(i).j_type.equals("Mumbai") && t1Cap<=3){
                t3Cap++;
            }
        }

    }
}
