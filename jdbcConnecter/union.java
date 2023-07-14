package jdbcConnecter;

import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        HashSet<Integer> Numbers = new HashSet<>();
        Numbers.add(2);
        Numbers.add(3);
        System.out.println("Set 1 = "+Numbers);

        HashSet<Integer> Numbers1 = new HashSet<>();
        Numbers1.add(4);
        Numbers1.add(7);
        System.out.println("Set 2 = "+Numbers1);

        Numbers1.addAll(Numbers);
        System.out.println("Union = "+Numbers1);


    }
    
}
