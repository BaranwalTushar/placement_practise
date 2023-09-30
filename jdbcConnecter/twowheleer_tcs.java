package jdbcConnecter;

import java.util.Scanner;

public class twowheleer_tcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Vehicle = sc.nextInt();
        int Wheels = sc.nextInt();

        int fourwheeler = (Wheels-(2*Vehicle))/2;
        int twowheeler = Vehicle-fourwheeler;

        System.out.println(fourwheeler +" "+ twowheeler);
    
}
    
}
