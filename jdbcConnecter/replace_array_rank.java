package jdbcConnecter;

import java.util.Arrays;
import java.util.HashMap;

public class replace_array_rank {
    public static void main(String[] args) {
        int array[] = {9,4,5,7,2,8,1};

        int sortedarr[] = Arrays.copyOf(array,array.length);

        Arrays.sort(sortedarr);

        HashMap <Integer,Integer> rankMap = new HashMap();
        for(int i=0;i<sortedarr.length;i++){
            rankMap.put(sortedarr[i],i+1);

        } 
        for(int i=0;i<array.length;i++){
            array[i] = rankMap.get(array[i]);
        }
        System.out.println(Arrays.toString(array));
      
    
    }

}
    

