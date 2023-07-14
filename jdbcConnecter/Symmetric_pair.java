package jdbcConnecter;

public class Symmetric_pair {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{2,3},{2,1},{4,2},{2,4}};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i][0]==arr[j][1] &&arr[j][0]==arr[i][1]){
                    System.out.println(arr[j][1]+" "+arr[j][0]);
                }
            }
        }


    }
    
}
