package jdbcConnecter;

public class Accenture_day_2prblm_8 {

    public static String MoveHyphens(String str){

        String str1 ="";
        String str2 ="";
       String str3 ="";


     for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);

        if(ch=='-'){
          str1 += ch;
        }
        else{
            str2 += ch;
        }
     }
     str3 = str1+str2;

     return str3 ;
    }
    public static void main(String[] args) {
        System.out.println("output");
        System.out.println(MoveHyphens("String-Compare"));
    }
    
}
