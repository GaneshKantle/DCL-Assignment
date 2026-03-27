package Objectclass;

public class ToString {
    String name;
    int id;
    String prod_bought;
    long phone_no;

    ToString(String name, int id, String prod_bought, long phone_no){
        this.name=name;
        this.id=id;
        this.prod_bought=prod_bought;
        this.phone_no=phone_no;
    }
    @Override
    public String toString(){
        return "\nName: "+name+"\nID: "+id+"\nProduct Bought: "+prod_bought+"\nPhone Number: "+phone_no;
    }

    public static void main(String[] args) {
        ToString ts=new ToString("Ganesh",21,"Hot Wheels", 1234567890);
        System.out.println(ts);
        System.out.println(ts.toString());
    }
}
