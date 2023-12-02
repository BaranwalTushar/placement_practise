package jdbcConnecter.Accenture_online_study;

import java.util.Scanner;

public class Accenture_greatest_neighbours {
    public static int neighbours(int []arr, int n){
       int l =0;
       int r=n-1;
       while(l<=r){
        int mid = (l+r)/2;

        if(mid==0&&arr[mid]>arr[mid+1]){
            return 0;
        }
        else if(mid == n-1&&arr[mid]>arr[n-2]){
            return mid;
        }
        else if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
            return mid;
        }
        else if(arr[mid]<arr[mid+1]){
            l = mid+1;

        }
        else{
            r= mid-1; 
        }
       }
       return 0;

    }
    public static void main(String[] args) {
        int n =7;
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(neighbours(arr, n));
        
             
        }
    }
    

