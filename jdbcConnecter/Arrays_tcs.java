package jdbcConnecter;

public class Arrays_tcs {
    public static void main(String[] args) {
        int arr[] = {3,4,5,8,9};
        int temp = arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=temp){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
