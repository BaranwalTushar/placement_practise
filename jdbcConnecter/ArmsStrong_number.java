package jdbcConnecter;

public class ArmsStrong_number {
    public static void main(String[] args) {
        int n = 153,reverse,remainder;
        double result =0;
        reverse = n;
        while(reverse!=0){
            remainder = reverse%10;
            result += Math.pow(remainder, 3);
            reverse /=10;
        }
        if(result == n){
            System.out.println("Armstrong ");
        }
        else{
            System.out.println("Not armstrongnumber");
        }

    }
    
}
