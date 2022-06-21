class Program {
    public static void main(String[] args) {
        Tax t1; // This is only declaration but not instantiation
        Tax tax = new Tax(); // creating an object for the class called Tax; This is to allocate some memory in the heap
        double taxVal = tax.getTax(12000.50);
        System.out.println("Tax to be paid is "+taxVal);
    }
}

class Tax{
    public double getTax(double salary){
        return salary * 0.25;
    }
}