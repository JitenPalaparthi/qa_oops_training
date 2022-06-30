public class Program {
    public static void main(String[] args) {
        try {
            IAccount acc = new CurrentAccount(12000.4f);
            managemeAccount(acc);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }

    public static void managemeAccount(IAccount iacc) throws Exception {
        iacc.display();
        iacc.withDraw(1200);
        iacc.display();
        iacc.withDraw(12000);
    }
}

interface IAccount extends IDisplay,IInterest  {
    float withDraw(float amt) throws Exception;
    
}
interface IDisplay{
    void display();
}
interface IInterest{
    float getInterest();
}

class Account {
    public float balance;

    public void display() {
        System.out.println("Balance:" + this.balance);
    }
}

class CurrentAccount extends Account implements IAccount {
    public CurrentAccount(float balance) {
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

class SavingAccount extends Account implements IAccount {

    public SavingAccount(float balance) {
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
