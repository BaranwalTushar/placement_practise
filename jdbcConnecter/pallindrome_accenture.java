package jdbcConnecter;

public class pallindrome_accenture {

    public static int ispalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {

        int tushar;
        tushar = ispalindrome("aca");
        System.out.println(tushar);
        
            }
    
}
