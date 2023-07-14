package jdbcConnecter;

import java.util.Scanner;

public class Countvowels {
    // public static boolean isvowel(char ch){
    //     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
    public static void main(String[] args) {
        // String str;
        // char ch;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String");
        // str = sc.nextLine();
        
        // int countvowels=0;
        // int countconstant=0;

        // for(int i=0;i<str.length();i++){
        //     ch=str.charAt(i);

        //     if(isvowel(ch)==true){
        //         countvowels++;
        //     }
        //     else
        //         countconstant ++;
            
            
                
        //     }
        //     System.out.println("Vowels = "+countvowels);
        //     System.out.println("Constant = "+countconstant);
        String str;
        char ch;
        int vowels =0;
        int constant =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String");
        str=sc.nextLine();
       for(int i=0;i<str.length();i++){
        ch = str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vowels ++;
        }
        else{
            constant++;
        }

       }  
       System.out.println("Vowels = "+vowels);
       System.out.println("Constant = "+constant);

    }
}

    

    
    

