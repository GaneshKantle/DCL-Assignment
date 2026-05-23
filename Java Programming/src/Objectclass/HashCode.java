package Objectclass;

public class HashCode {
    String name;
    int id;
    String prod_bought;
    long phone_no;

    HashCode(String name, int id, String prod_bought, long phone_no) {
        this.name = name;
        this.id = id;
        this.prod_bought = prod_bought;
        this.phone_no = phone_no;
    }

// toString() method is overrding and getting new implementation here manually
//    @Override
//    public String toString(){
//        return "\nName: "+name+"\nID: "+id+"\nProduct Bought: "+prod_bought+"\nPhone Number: "+phone_no +"\n"+ hashCode();
//    }

    //If I print the hashcode without toString it will print the hexadecimal value of the number which
    // I passed in the method, but if explicitly called the toString() method by printing the hashCode it will print as
    // it is like with toString and print 100 it will print 100, w/o toString it will print 64(after converting it to
    // the hexa decimal)
    public int hashCode() {
        return 100;
    }

    public static void main(String[] args) {
        HashCode ts = new HashCode("Ganesh", 21, "Hot Wheels", 1234567890);
        System.out.println(ts);
        System.out.println(ts.toString());
    }
}
