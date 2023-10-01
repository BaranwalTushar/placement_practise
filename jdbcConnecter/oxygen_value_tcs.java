package jdbcConnecter;

import java.util.Scanner;

public class oxygen_value_tcs {
    public static void main(String[] args) {
       int max =0;
       int [][] trainee = new int[3][3];
       int [] avg = new int[3];

       Scanner sc = new Scanner(System.in);
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
           
            trainee[i][j] = sc.nextInt();

            if(trainee[i][j]<1|| trainee[i][j]>100){
                trainee[i][j] = 0;
            }
        }
       }
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            avg[i] = avg[i]+trainee[j][i];
           
        }
         avg[i] = avg[i]/3;
       }
       for(int i=0;i<3;i++){
        if(avg[i]>max){
            max= avg[i];
        }
       }
       for(int i=0;i<3;i++){
        if(avg[i]==max){
            System.out.println(i+1);
        }
        if(avg[i]<70){
            System.out.println("Unfit");
        }


       }
       

    }
    
}
