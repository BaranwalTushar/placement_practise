package jdbcConnecter;

public class sum_of_no {
    public static int Mathchallenge(int n){
        int sum =0;
        for(int i=0;i<=n;i++){
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result = 12;
        System.out.println(Mathchallenge(result) );
        
    }
    
}
