package jdbcConnecter;

import java.util.StringTokenizer;

public class stringtoken {
    public static void main(String[] args) {
        StringTokenizer st  = new StringTokenizer("Tushar is a good boy ");//Stringtokenizer important
        while(st.hasMoreTokens()){              //hasMoreToken() method is used
            System.out.println(st.nextToken());
        }
        
    }
    
}
