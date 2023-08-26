package jdbcConnecter;

public class combination {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
       
    }

    public static int ncr(int n,int r){
        return fact(n)/(fact(r) * fact(n-r));
    }
    
    public static void main(String[] args) {
        System.out.println("combination = "+ncr(5,2));
       
    }
    
}
