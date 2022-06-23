package loops;
public class While {
    public  void printNumbers(int n){
        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
    }

    public  int sumOfNumbers(int n){
        int i=1;
        int sum=0;
        while(i<=n){
            sum = sum +i; // sum+=i
            i++;
        }
        return sum;
    }

    public  void printEvenNumbers(int n){
        int i=2;
        while(i<=n){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();
    }
}
