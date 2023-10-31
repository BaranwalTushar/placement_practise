package jdbcConnecter;

import java.util.Arrays;
import java.util.Scanner;

public class Accenture_Maximum_Elementandits_index {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array");
        int n = sc.nextInt();
         
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max_element = arr[0];
        int max_index =0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max_element){
                max_element = arr[i];
                max_index = i;
            }
        }
        System.out.println(max_element+" "+max_index);

        
        

    }
    
}
