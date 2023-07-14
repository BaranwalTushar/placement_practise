package jdbcConnecter;

import java.util.ArrayList;
import java.util.HashSet;

public class remove_dupicate {
    public static void main(String[] args) {
        ArrayList<Integer> duplicate = new ArrayList();
        duplicate.add(1);
        duplicate.add(2);
        duplicate.add(1);
        duplicate.add(3);
        duplicate.add(2);
        duplicate.add(4);
        duplicate.add(5);

        System.out.println("With Duplicate Element = "+duplicate);

        HashSet<Integer> set = new HashSet<>(duplicate);
        ArrayList<Integer> Withoutdupliccate = new ArrayList(set);
        System.out.println("Without Duplicate Element = "+Withoutdupliccate);


    }
    
}
