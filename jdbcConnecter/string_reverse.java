package jdbcConnecter;

public class string_reverse {
    public static void main(String[] args) {
        String str = "tushar";
        System.out.println("Original String = "+str);
        System.out.println();
        System.out.println("After REverse");

        char[] ch = str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
    
}
