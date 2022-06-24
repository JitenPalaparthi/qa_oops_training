import java.util.*;
class Program{
    public static void main(String[] args){
        Employee emp1 = new Employee(1001, "Jiten Palaparthi");
        System.out.println("Employee Number:"+emp1.Number+" Employee Name:"+emp1.Name);
        System.out.println("Employee Company:"+Employee.getDetails());
    }
}


class Employee
{
    public int Number;
    public String Name; 

    private static String Company = "QA Labs";

    public Employee(int number, String name)
    {
        this.Number = number;
        this.Name = name;
    }

    public static String getDetails(){
        return Company;
        // Here Name and Number cannot be used here because static method can use only static fields
    }

}