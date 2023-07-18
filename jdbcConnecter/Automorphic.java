package jdbcConnecter;

public class Automorphic {
    public static boolean Automorphic(int n){
        int square = n*n;

        for(int i=1;i<n;i++){
            if(n%10!= square%10){
                return false;
            }
            // n = n/10;
            // square=square/10;
            else if(n%10 == square%10){
                return true;
            }
           
            
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Automorphic(25));
        System.out.println(Automorphic(13));
        
    }
    
}
