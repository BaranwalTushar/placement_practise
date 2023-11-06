package jdbcConnecter;

public class Accenture_misiing_num {
    public static int missin(int arr[],int n){
      boolean aux[] = new boolean[100000];
      for(int i=0;i<arr.length;i++){
        if(arr[i]>0&&arr[i]<n){
            aux[arr[i]] = true;
        }
      }
      int small =1;
      while(aux[small]){
        small++;
      }
      return small;

    }
    public static void main(String[] args) {
        int[]arr = {0,10,2,-10,-20};
        System.out.println(missin(arr, 5));
    }
    
}
