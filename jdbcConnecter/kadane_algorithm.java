package jdbcConnecter;

public class kadane_algorithm {
    public static int kadane(int []arr){
        int sum =0;
        int maxsum = arr[0];

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum>maxsum){
                maxsum = sum;
            }
            else if(sum<0){
                sum = 0;
            }
        }
        return maxsum;

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,-2,5};
        System.out.println(kadane(arr));
        
    }
    
}
