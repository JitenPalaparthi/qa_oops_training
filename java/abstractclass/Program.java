public class Program {
    public static void main(String[] args) {
        try {
           // Account acc = new Account(); cannot create instance for the abstract class
           Account acc = new CurrentAccount(12000.50f);
            acc.displayBalance();
            acc.withDraw(1000);
            acc.displayBalance();
            acc.withDraw(12000.00f);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
}

abstract class Account {

    public float balance;
    public abstract float withDraw(float amt) throws Exception;
    public abstract float getInterest();
    // If below method is uncommented , then it must be implemented by the derived classes. Otherwise error
    //public abstract float deposit(float amt);
    public void displayBalance() {
        System.out.println("Balance in the Account:" + this.balance);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(float balance){
        this.balance = balance;
    }


    public float withDraw(float amt) throws Exception {
        if (amt <= this.balance) {
            this.balance = this.balance - amt;
        } else {
            throw new Exception("Error----> Low balance.");
        }
        return this.balance;
    }

    public float getInterest() {
        return this.balance * 0.5f;
    }

   
}

class SavingAccount extends Account {
    
    public SavingAccount(float balance){
        this.balance = balance;
    }
    

    public float withDraw(float amt) throws Exception {

        if (amt <= this.balance) {
            this.balance = this.balance - amt;
        } else {
            throw new Exception("Error---> Low balance.");
        }
        return this.balance;
    }

    public float getInterest() {
        return this.balance * 0.8f;
    }
    
}
