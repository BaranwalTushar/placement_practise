package jdbcConnecter;

import java.util.Arrays;
import java.util.Scanner;

public class Acenture_day2_problem_5 {
    public static int defsmallestproduct(int sum,int []arr){
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        int product = 0;

        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest = arr[i];

            }
            else if(secondsmallest>arr[i]&&arr[i]!=smallest){
                secondsmallest = arr[i];

            }
        }

        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr.length;j++){
                if(i!=j&&(arr[i]+arr[j])<sum){
                    product = arr[i]*arr[j];
                }
            }
        }
        return product;
    }
       
    public static void main(String[] args) {
       int []arr ={5,2,4,3,9,7,1};
       int sum =9;
       System.out.println(defsmallestproduct(sum, arr));
    }

    }
    

