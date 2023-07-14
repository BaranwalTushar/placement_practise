package jdbcConnecter;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        if(str1.length()==str2.length()){
            char[] chararray1 = str1.toCharArray();
            char[] chararray2 = str2.toCharArray();

            Arrays.sort(chararray1);
            Arrays.sort(chararray2);

            boolean result = Arrays.equals(chararray1, chararray2);
            if(result){
                System.out.println(str1 + " and "+str2 + " are "+"Anagram ");
            }
            else{
                System.out.println("not anagram");
            }
        }
        
    }
    
}
