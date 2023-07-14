package jdbcConnecter;

public class search {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int search = 7;
        int ans = 0;
        for(int i=0;i<=arr.length-1;i++){
            if(search==arr[i]){
                ans = i;
            }
        }
        System.out.println("the no. is in index " + ans);
    }
    
}
