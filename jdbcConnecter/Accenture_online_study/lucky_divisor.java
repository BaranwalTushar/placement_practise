package jdbcConnecter.Accenture_online_study;

import java.util.Scanner;

public class lucky_divisor {
    public static void main(String[] args) {
        int[] arr= {4,7,47,74,44,77,477,474,447,774,747,777,444};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        boolean flag = false;
         for(int i=0;i<arr.length;i++){
            if(n%arr[i]==0){
                flag = true;
            }
         }
        if(flag==true){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    
    
        
       }

    }
    

