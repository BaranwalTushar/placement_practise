package jdbcConnecter;

public class Accenture_day_2_problem1 {
    public static int findcount(int []arr,int len,int num,int diff){
       int ans =0;
       int count =0;
        for(int i=0;i<arr.length;i++){
           ans = Math.abs(arr[i]-num);
            if(ans<=diff){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {12,3,14,56,77,13};
       
        System.out.println(findcount(arr, 6, 13, 2));
    }
    
}
