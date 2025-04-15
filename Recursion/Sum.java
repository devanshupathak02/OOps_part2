public class Sum {
    public static int sum(int n){
       //n=5 --> 1+2+3+4+5
       if( n==1){
        return 1;
       }
        int snm1=sum(n-1); //lets assume that somehow it manage to get the sol^n 
        int s=n+sum(n-1);
        return s;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.print(sum(n));
    }
    
}
