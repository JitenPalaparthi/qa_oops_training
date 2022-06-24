namespace Lesson11{
class Program{
 public static void Main(string[] args){

        Status status = Status.INACTIVE;
        expectStatus(Status.INACTIVE);
        expectStatusStr("ACTIVE");
        expectStatusStr("MAYBE_WORKING");
    }
    
    public static void expectStatus(Status status){
        if(status == Status.INACTIVE || status==Status.RETIRED){
            Console.WriteLine("Not doing the job");
        }else{
            Console.WriteLine("Performing the job");
        }
    }

    public static void expectStatusStr(String status){
        if(status == "INACTIVE" || status=="RETIRED"){
             Console.WriteLine("Not doing the job");
        }else{
             Console.WriteLine("Performing the job");
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
}