package jdbcConnecter;

import java.util.Scanner;

public class remove_vowels {
    public static String removevowels(String str){
        return str.replaceAll("[aeiou]", "");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println(removevowels(str));
        

        
        
    }
    
}
