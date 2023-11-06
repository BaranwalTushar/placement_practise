package jdbcConnecter.Accenture_online_study;

import java.sql.Struct;
import java.util.Scanner;

public class Accenture_garage_problem {
    public static int calculaterevenue(int[][]Garages){
       int totalrevenue=0;
       int maxreveneue =0;
       for(int []garage:Garages){
        if(garage.length==3){
            int bikes = garage[0];
            int car =garage[1];
            int truck = garage[2];
            
             totalrevenue = ((100*bikes)+(250*car)+(500*truck));

             if(totalrevenue>maxreveneue){
                maxreveneue = totalrevenue;
             }
        }

       }
       
        return maxreveneue;
        
    }
    
    public static void main(String[] args) {
        int [][] Garages = {{6,8,2},{5,7,8},{14,10,11},{11,13,5}};
        int revenue = calculaterevenue(Garages);
        System.out.println(revenue);
        
        
    }
    
}
