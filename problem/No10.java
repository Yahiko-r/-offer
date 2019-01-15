package problem;

public class No10 {
    //fibonacci
    private int fib(int n){
        int n1=0;
        int n2=1;
        int n3=0;
        for(int i=3;i<=n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        if(n==1)return 1;
        return n3;
    }
}
