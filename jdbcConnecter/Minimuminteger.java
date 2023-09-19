package jdbcConnecter;

public class Minimuminteger {
    public static void main(String[] args) {
        int arr[] = {1,3,2};
        int sum =0;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
           sum += arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(sum<=arr.length*arr[i]){
                min = Math.min(min, arr[i]);
            }
        }
        System.out.println(min);
    }
    
}
