public class JavaBeanClass {
    private String name;
    private int accName;
    private double balance;

    public void setName(String name){
        this.name=name;
        System.out.println();
    }
    public String getName(){
        return name;
    }

    public void setAccName(int accName){
        this.accName=accName;
    }
    public int getAccName(){
        return accName;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
}

class BeanClass{
    public static void main(String[] args) {
        JavaBeanClass j=new JavaBeanClass();

        j.setName("Ganesh");
        System.out.println(j.getName());

        j.setAccName(980902389);
        System.out.println(j.getAccName());

        j.setBalance(483924873);
        System.out.println(j.getBalance());
    }
}

//Create a class employe with four employee name, salary, id, dept and achive encapsulation

