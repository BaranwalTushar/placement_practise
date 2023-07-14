package jdbcConnecter;

public class ArmsStrong_number {
    public static void main(String[] args) {
        int n = 153,originalnumber,remainder;
        double result =0;
        originalnumber = n;
        while(originalnumber!=0){
            remainder = originalnumber%10;
            result += Math.pow(remainder, 3);
            originalnumber /=10;
        }
        if(result == n){
            System.out.println("Armstrong ");
        }
        else{
            System.out.println("Not armstrongnumber");
        }

    }
    
}
