package jdbcConnecter;

import java.util.Scanner;

public class one_D_array {
    public static void main(String[] args) {
        int []arr = new int[5];
        arr[0] = 50;
        arr[1] = 60;
        arr[2] = 70;
        arr[3] = 80;
        arr[4] = 90;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the no. of index");
        int n = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
    
}
