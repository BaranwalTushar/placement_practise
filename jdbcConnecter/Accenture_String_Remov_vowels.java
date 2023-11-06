package jdbcConnecter;

public class Accenture_String_Remov_vowels {
    public static String removevowel(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(!vowel(ch)){
                sb.append(ch);
            }

        }
        return sb.toString();
    }

    private static boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        String str = "Tushar";
        System.out.println(removevowel(str));

    }

    
}