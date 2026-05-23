//Create a class employe with four employee name, salary, id, dept and achive encapsulation
public class EmployeeEncapsulation {
    private String name;
    private int id;
    private String dept;
    private double salary;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setDept(String dept){
        this.dept=dept;
    }
    public String getDept(){
        return dept;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
}

class EmployeeBeanClass{
    public static void main(String[] args) {
        EmployeeEncapsulation j=new EmployeeEncapsulation();

        j.setName("Ganesh");
        System.out.println(j.getName());

        j.setDept("BLOCKCHAIN");
        System.out.println(j.getDept());

        j.setId(12345);
        System.out.println(j.getId());

        j.setSalary(60000);
        System.out.println(j.getSalary());

    }
}

//Create a class employe with four employee name, salary, id, dept and achive encapsulation

