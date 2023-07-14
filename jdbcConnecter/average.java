package jdbcConnecter;

public class average {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        double sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        double result = sum/arr.length;
        System.out.println(result);

    }
    
}
