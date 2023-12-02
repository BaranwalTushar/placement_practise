package jdbcConnecter.Accenture_online_study;

public class greatest_diffrence {

    public static int diff(int n,int m,int []arr1,int []arr2){
        int diff=0;
        int max =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

               diff = Math.abs(arr1[i]-arr2[j]);
               if(diff>max){
                max= diff;
               }

                }

            }
            return max;
        }
    
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int [] arr1 = {1,45,2,7,9};
        int[] arr2 = {89,3,5,7,8};
        System.out.println(diff(n, m, arr1, arr2));
    }
    
}
