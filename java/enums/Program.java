import java.util.*;
public class Program {
    public static void main(String[] args){

        Status status = Status.INACTIVE;
        expectStatus(Status.INACTIVE);
        expectStatusStr("ACTIVE");
        expectStatusStr("MAYBE_WORKING");
    }
    
    public static void expectStatus(Status status){
        if(status == Status.INACTIVE || status==Status.RETIRED){
            System.out.println("Not doing the job");
        }else{
            System.out.println("Performing the job");
        }
    }

    public static void expectStatusStr(String status){
        if(status == "INACTIVE" || status=="RETIRED"){
            System.out.println("Not doing the job");
        }else{
            System.out.println("Performing the job");
        }
    }
    public enum Status{
        ACTIVE,
        INACTIVE,
        RETIRED,
        CONTRACTOR,
        PERMANENT
    }
}


