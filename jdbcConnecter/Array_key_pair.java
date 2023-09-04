package jdbcConnecter;
import java.util.HashMap;

public class Array_key_pair {

    public static boolean pair(int[] arr,int x){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){

            int num = x - arr[i];
            if(map.containsKey(num) && map.get(num)!= i)
                return true;
            
        }
        return false;
    }
    public static void main(String[] args) {

        int arr[] = {1,4,45,6,10,8};
        int x = 16;
        System.out.println(pair(arr, x));
    }
    
}
