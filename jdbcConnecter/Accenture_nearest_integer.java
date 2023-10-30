package jdbcConnecter;

public class Accenture_nearest_integer {

    public static int nearest(int dividend,int divisor){
        int remainder =0;
        int nearest_integer =0;
        remainder = dividend%divisor;

        if(remainder<(divisor+1)/2){
           nearest_integer = dividend-remainder;
        }
        else{
            nearest_integer = dividend+(divisor-remainder);
        }
        return nearest_integer;
    }
    public static void main(String[] args) {
        System.out.println(nearest(26, 3));
        
    }
    
}
