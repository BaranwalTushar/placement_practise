package jdbcConnecter;

import java.util.Arrays;

public class plus_one {
    public static int[] plus(int []num){
        for(int i=num.length-1;i>=0;i--){
            if(num[i]<9){
                num[i]++;
                return num;
            }
            num[i] = 0;
        }
        int newnumber[] = new int[2];
        newnumber[0] =1;
        return newnumber;
    }
    public static void main(String[] args) {
        int[] arr ={9}; 
        System.out.println(Arrays.toString(plus(arr)));
    }
    
}
