package jdbcConnecter.Accenture_online_study;

public class sun {
    public static int Seeingsun(int []arr,int n){
        int max=0;
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int []arr = {7,4,8,2,9};
        int n = 5;
        System.out.println(Seeingsun(arr, n));
    }
    
}
