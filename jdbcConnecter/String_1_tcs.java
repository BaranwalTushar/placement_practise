package jdbcConnecter;

import java.util.Scanner;

public class String_1_tcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";

    

        String one = sc.nextLine();
         String two = sc.nextLine();
         String three = sc.nextLine();

        result1 = one.replaceAll("[a,e,i,o,u]","%");
       result2 = two.replaceAll("[b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,y,z]","#");
       result3 = three.toUpperCase();
       System.out.println(result3);

       result4 = result1+result2+result3;
       System.out.println(result4);



    }
    
}
