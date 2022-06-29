import java.io.*;
import java.lang.*;

public class Program {
// Try with resource exception
    public static void main(String[] args) {
         try(FileInputStream file = new FileInputStream("abcd.txt")){
           byte[] arr =  file.readAllBytes();
           System.out.println(arr);

        }catch(Exception exp){
            System.out.println("Exception--->"+exp.getMessage());
        }
    }
}


