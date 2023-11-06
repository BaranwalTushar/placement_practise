package jdbcConnecter;


public class pallindrome_accenture {

    public static boolean ispalindrome(String str){
       StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())){
           return true ;
        }
        return false;
    }
    public static void main(String[] args) {
        
        String tushar = "abba";
       System.out.println(ispalindrome(tushar));
        
            }
    
}
