package empsal;
import java.util.*;

public class Employee {
    private String name;
    private int id;
    private float salary;
    private float bonus;

    public Employee(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setBonus(float bonus) {
        if (bonus < 0) {
            this.bonus = 0;
        }
        this.bonus = bonus;
    }

    public float getBonus() {
        return this.bonus;
    }

    public float calculateBonus() {
        if (this.salary <= 10000) {
            setBonus(getBonus((byte) 8, this.salary));
            return getBonus();
        } else if (this.salary > 10000 && this.salary <= 12000) {
            setBonus(getBonus((byte) 5, this.salary));
            return getBonus();
        } else if (this.salary > 12000) {
            setBonus(getBonus((byte) 4, this.salary));
            return getBonus();
        } else {
            this.setBonus(0);
            return getBonus();
        }
    }
public String displayEmployee(){
    String line = String.format("Name:%s\tID:%d\tSalary:%.2f\tBonus:%.2f\t Total[Sal+Bonus]:%.2f\n",this.name,this.id,this.salary,this.bonus,(this.salary+this.bonus));
    //System.out.println("Name:"+this.name+"\tID:"+this.id+"\tSalary:"+this.salary+"\tBonus:"+this.bonus+"\t Total[Sal+Bonus]:"+(this.salary+this.bonus));
    System.out.println(line);
    return line;
}
    private float getBonus(byte bonus, float sal) {
        return sal * bonus / 100;
    }
}
