package jdbcConnecter;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList();
        arraylist.add(12);
        arraylist.add(14);
        arraylist.add(17);
        arraylist.add(27);

        System.out.println(arraylist);

        int i = arraylist.get(1);
        System.out.println(i);

        arraylist.set(1, 5);
        System.out.println(arraylist);

        i=arraylist.remove(2);
        System.out.println(arraylist);
        System.out.println(i);
       


    }
    
}
