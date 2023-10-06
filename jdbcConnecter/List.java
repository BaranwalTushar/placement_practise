package jdbcConnecter;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
    /* input->  5
       12 0 1 78 12
        2
       Insert
       5 23
       Delete
       0

       output-> 0 1 78 12 23
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            list.add(ele);
        }
       int q = sc.nextInt();
       for(int i=0;i<q;i++){
        

        String str = sc.next();
        if(str.equals("Insert")){
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(x,y);

        }
        else{
            int x = sc.nextInt();
            list.remove(x);
        }
        
       }
     System.out.println(list);
       
       

        
    }
    
}
