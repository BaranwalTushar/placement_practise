package jdbcConnecter;

public class Accenture_Day2_problem_4 {
    public static int differenceofsum(int n,int m){
        int sum =0;
        int sum1 =0;

        for(int i=1;i<=m;i++){
            if(i%n==0){
                sum += i;
                
            }
            else if(i%n!=0){
                sum1 += i;
                
                
            }
        }
        return sum1-sum;
    }
    public static void main(String[] args) {
        System.out.println(differenceofsum(4, 20));
        
    }
    
}
