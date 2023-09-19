package jdbcConnecter;

public class greater_right_side {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n=6;

        arr[n-1] = -1;
        for(int i=n-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = Math.max(arr[n-1], temp);

        }
        
    }
    
}
