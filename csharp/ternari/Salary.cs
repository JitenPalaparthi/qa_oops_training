namespace SalaryCaluclation{
public class Employee{
    public double CaluclatePF(double salary){
        if (salary>2100){
            return salary*0.4;
        }else{
            return salary*0.2;
        }

    } 
}

}