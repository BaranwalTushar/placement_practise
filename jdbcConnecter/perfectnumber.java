package jdbcConnecter;

public class perfectnumber {
    public static void main(String[] args) {
        int number = 28;
        int sum =0;
        for(int i =1;i<number;i++){
            if(number%i==0){
              sum +=i; 
            }
        }

        if(sum == number){
            System.out.println("perfect number");
        }
        else{
            System.out.println("Not perfect number");
        }
    }
    
}
