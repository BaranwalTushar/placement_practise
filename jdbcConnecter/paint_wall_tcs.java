package jdbcConnecter;

import java.util.Scanner;

public class paint_wall_tcs {
    public static void main(String[] args) {
        float sum =0;
        float sum1 =0;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the interio wall");
       int Iw = sc.nextInt();

       
       for(int i=0;i<Iw;i++){
        float Iwsqfeet = sc.nextFloat();
        sum += Iwsqfeet;

       }
       sum = sum*18;

       System.out.println("Enter the Exterior wall");
       int Ew = sc.nextInt();

      

       for(int i=0;i<Ew;i++){
         float Ewsqfeet = sc.nextFloat();
        sum1 += Ewsqfeet;
       }
       sum1 = sum1*12;
       float result = sum+sum1;

       System.out.println("Total Estimated cost "+result);
       
       
    }
    
}
