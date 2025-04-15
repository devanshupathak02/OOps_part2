public class Nfibonachi {
    public static int nfibo(int n){
        // 0 1 1 2 3 5 8 13
        if(n==0){
            return 0;

        }else if(n==1){
            return 1;
        }
        int fnm1=nfibo(n-1);
        int fnm2=nfibo(n-2);
        int fn=nfibo(n-1)+nfibo(n-2);
        return fn;

        

    }
    public static void main(String[] args) {
       int n=25;    
        System.out.print(nfibo(n));
    }
}
