public class Program {
    public static void main(String[] args) {
        try {
            Voter v1 = new Voter("Jiten", (byte) 37, "JitenP@Outlook.Com");
            v1.vote();
            v1.showVoter();

            Voter v2 = new Voter("Jiten", (byte) 17, "JitenP@Outlook.Com");
            v2.vote();
            v2.showVoter();
        } catch (VoteException exp) {
            System.out.println(exp.getMessage());
        }
    }
}

class Voter {
    public String name;
    public byte age;
    public String email;
    public boolean isVoted;

    public Voter(String name, byte age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isVoted = false;
    }

    public void vote() throws VoteException {
        if (age < 18) {
            throw new VoteException("age is "+age + ".Age is less then 18 years. Invalid Voter exception");
        }
        this.isVoted = true;
    }

    public void showVoter(){
        System.out.printf("Name:%s\temail:%s\tAge:%d:\tVoting Status:%b\n",this.name,this.email,this.age,this.isVoted);
    }
}

class VoteException extends Exception {
    public VoteException(String message) {
        super(message);
    }
}
