public class IncreasingOrder{
    public static void print(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");// remember the stack flow follow th estack then empty the stack
        
       
    }
    public static void main(String args[]){
       int n=10;

       print(n);
    }
}