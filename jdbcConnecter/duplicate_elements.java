package jdbcConnecter;

public class duplicate_elements {
    public static void  findduplicate(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Element = "+arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,2,5,4};
        findduplicate(arr);
    }
    
}
