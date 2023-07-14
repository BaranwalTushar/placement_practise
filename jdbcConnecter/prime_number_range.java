package jdbcConnecter;

public class prime_number_range{
    public static void isprime(int n){
        int count =0;
        if(n<1){
            System.out.println("Not prime");
        }
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                count ++;
            }
        }
        if(count>1){
            System.out.println("Not prime");
        }
        else{
            System.out.println("prime");
        }
    }
    
        
    public static void main(String[] args) {
        
        int lower=1;
        int upper = 15;
        for(int i=lower;i<=upper;i++){
             isprime(i);
             System.out.println(i);

        }
            

        
   
    
}
    
}
