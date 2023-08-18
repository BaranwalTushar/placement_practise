package jdbcConnecter;

import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {

   public static ArrayList<List<Integer>> generate(int nums){

    if(nums ==0){
        return new ArrayList<>();
    }
     
    ArrayList<List<Integer>> result = new ArrayList<>();
    for(int i=1;i<=nums;i++){
        ArrayList<Integer> row = new ArrayList<>();

        for(int j=0;j<i;j++){
            if(j==0||j==i-1){
                row.add(1);
            }
            else{
                row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));

            }

        }
        result.add(row);
    }
    return result;
   }
    public static void main(String[] args) {
        int nums = 5;
        System.out.println(generate(nums));
        
    }
    
}
