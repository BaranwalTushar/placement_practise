package jdbcConnecter;

public class print_1_to_100 {
    public static void Loop(int n){
        if(n>0){
            Loop(n-1);
            System.out.print(n +" ");
        }
        return;
    }
    public static void main(String[] args) {
       Loop(100);
        
    }
    
}
