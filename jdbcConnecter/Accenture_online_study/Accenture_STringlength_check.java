package jdbcConnecter.Accenture_online_study;

public class Accenture_STringlength_check {
    public static void main(String[] args) {
        
       String  str = "Think5";

       int length = str.length()-1;
       if(Character.isDigit(str.charAt(length))&&Integer.parseInt(str.substring(length))==length){
        System.out.println("True"+""+length);
       }
       else{
        System.out.println("False"+""+length);
       }
        
    }
    
}
