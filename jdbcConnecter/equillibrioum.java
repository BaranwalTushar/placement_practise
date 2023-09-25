package jdbcConnecter;

public class equillibrioum {
    public static int Equii(int arr[],int n){
        int sr =0;
        int sl =0;
        if(arr.length==1) return 1;
        for(int i=1;i<n;i++){
            sr += arr[i];

        }
        for(int i=0;i<n-1;i++){
            if(sr==sl){
                return i+1;
            }
            sl += arr[i];
            sr -= arr[i+1];
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] ={1,3,5,2,2};
        int n=5;
        System.out.println(Equii(arr, n));
    }
    
}
