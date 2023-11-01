package jdbcConnecter;

public class Accenture_String_Remov_vowels {

    public static void main(String[] args) {

        String str = "TuShAr";

        String string = str.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "");
        System.out.println(string);
        
    }

    
}