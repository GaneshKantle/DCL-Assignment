package Collections;

import java.util.*;

class Passenger {
    String name;
    int id;
    String destination;

    Passenger(int id, String name, String destination) {
        this.id = id;
        this.name = name;
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", id=" + id + ", destination=" + destination + "]";
    }

}

public class List1 {
    public static void main(String[] args) {
        List<Passenger> Banglore = new ArrayList<>();
        List<Passenger> Chennai = new ArrayList<>();
        List<Passenger> Mumbai = new ArrayList<>();
        List<Passenger> waiList = new ArrayList<>();

        List<Passenger> people = new ArrayList<>();

        people.add(new Passenger(1, "Varun", "Bengaluru"));
        people.add(new Passenger(2, "Vishnu", "Chennai"));
        people.add(new Passenger(3, "Prajwal", "Mumbai"));
        people.add(new Passenger(4, "Suhas", "Mumbai"));
        people.add(new Passenger(5, "Ganesh", "Mumbai"));
        people.add(new Passenger(6, "Abhi", "Mumbai"));

        for (Passenger p : people) {
            if (p.getDestination().equals("Bengaluru")) {
                if (Banglore.size() >= 3) {
                    waiList.add(p);
                } else {
                    Banglore.add(p);
                }
            } else if (p.getDestination().equals("Chennai")) {
                if (Chennai.size() >= 3) {
                    waiList.add(p);
                } else {
                    Chennai.add(p);
                }
            } else if (p.getDestination().equals("Mumbai")) {
                if (Mumbai.size() >= 3) {
                    waiList.add(p);
                } else {
                    Mumbai.add(p);
                }
            } else {
                System.out.println("wait for the bus ur searching for");
            }
        }
        System.out.println("Bangalore : " + Banglore);
        System.out.println("Chennai : " + Chennai);
        System.out.println("Mumbai : " + Mumbai);
        System.out.println("Waitlist : " + waiList);
    }
}