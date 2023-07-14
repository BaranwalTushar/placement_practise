package jdbcConnecter;

import java.util.Scanner;
class Palindrome{
    public static boolean checkpallindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());//important
    }

}

public class pallindrome {
   
    public static void main(String[] args) {
        /* 
          int n,r,sum=0,reversed;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n= sc.nextInt();

        reversed = n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(reversed==sum){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
        */
       
      //using String builder
      
        System.out.println( Palindrome.checkpallindrome("madam"));
      

    }
    
}
