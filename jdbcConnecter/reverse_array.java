package jdbcConnecter;

public class reverse_array {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5};
        System.out.println("Before reversed a array");
        for(int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);
        }
        System.out.println("after reversed array");

        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    
}
