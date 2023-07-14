package jdbcConnecter;
import java.util.*;

 public class primenumber {
    public static void main(String[] args) {
        int n,i;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...");
        n=sc.nextInt();
        if(n<1){
            System.out.println("not prime");
        }
        for( i=1;i<=n/2;i++){
            if(n%i==0){
                count ++;
            }
            
        }
        
        if(count>1){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime number");
        }

    }

    
}
