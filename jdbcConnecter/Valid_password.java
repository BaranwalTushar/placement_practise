package jdbcConnecter;

import java.util.Scanner;

public class Valid_password {
    public static void main(String[] args) {
        int result =0,result1 =0, result2 =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String tus  = sc.nextLine();

        if(tus.length()>=4 && !(tus.charAt(0)>=0&&tus.charAt(0)<=9)){
            for(int i=0;i<tus.length();i++){
                char ch = tus.charAt(i);
                
                if(ch>='A'&&ch<='Z'){
                    result = 1;
                }
                if(ch>='1'&&ch<='9'){
                    result1 =1;
                }
                if(ch==' ' || ch=='\\'){
                   result2 =1;
                }
            }
            if(result==1&&result1==1&&result2!=1){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
            
        }
        else{
            System.out.println(0);
        }
    }
    
}
