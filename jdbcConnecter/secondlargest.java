package jdbcConnecter;

import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Elements...");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter all elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                }
               

            }
        }
        System.out.println("Second largest = "+arr[n-2]);
        System.out.println("Smallest = "+arr[0]);
        System.out.println("Second smallest "+arr[1]);
        System.out.println("Largest element "+arr[n-1]);
        
        }
    }
    

