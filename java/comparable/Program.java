import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args){

        ArrayList<Account> arr = new ArrayList<Account>();
        arr.add(new Account(101,2000,"Jiten"));
        arr.add(new Account(102,2200,"Rajan"));
        arr.add(new Account(103,1000,"Anil"));
       Collections.sort(arr);

        for(Account a : arr){
            System.out.println("Name:"+a.name+"\tId:"+a.id+"\tbalance:"+a.balance);
        }
    }
}

class Account implements Comparable<Account>{ 
    public int id, balance;
    public String name;
 
    public Account(int id, int balance, String name) {
     this.id = id;
     this.balance = balance;
     this.name = name;
    }
 
  
    public int compareTo(Account other) {
     return this.balance - other.balance;
    }
 }