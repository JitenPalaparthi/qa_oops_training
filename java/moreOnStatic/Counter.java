public class Counter {
    public static int GlobalCount = 0;
    public int ObjectCount = 0;

    public void incCount(){
        Counter.GlobalCount=Counter.GlobalCount +this.ObjectCount;
    }
    
    public static void incGlobalCount() {
        Counter.GlobalCount += 1;
    }

    public static void displayGlobalCount(){
        System.out.println("Global Count:"+GlobalCount);
    }

    public void incObjCount() {
        this.ObjectCount += 1;
    }
    
    public void displayObjectCount(){
        System.out.println("Object Count:"+this.ObjectCount);
    }

}
