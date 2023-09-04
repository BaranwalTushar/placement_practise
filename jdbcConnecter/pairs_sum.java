package jdbcConnecter;

import java.util.ArrayList;
import java.util.Arrays;

public class pairs_sum {
    /* 
      A[] = {1, 2, 4, 5, 7}
    B[] = {5, 6, 3, 4, 8} 
    X = 9 
    Output: 
     1 8
     4 5 
     5 4
    */
    public static pair[] allPairs( long A[], long B[],  long X){
        Arrays.sort(A);
        Arrays.sort(B);
        int ans =0;

        ArrayList<pair> list = new ArrayList<>();

        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                ans = (int) A[i] + (int) B[j];

                if(ans==X){
                    list.add(new pair(A[i],B[j]));

                }

            }
        }
        pair[] Pair = new pair[list.size()];
        return list.toArray(Pair);


    }
   public static void main(String[] args) {
    long A[] ={1,2,4,5,7};
    long B[] = {5,6,3,4,8};
    long X =9;

   System.out.println(allPairs(A, B, X));

    
    
   }
    
}
