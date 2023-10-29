package jdbcConnecter;

import java.util.Scanner;

public class Accenture_String_permutation {
    public static void main(String[] args) {
        int count =0;
        int mul =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            count++;
        }

        for(int i=count;i>=1;i--){
            mul = i*mul;
        

        }
        System.out.println(mul);

    }
    
}
