package jdbcConnecter;



public class count {
    public static void main(String[] args) {
        int []arr = new int[5];
        int count =0;
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i=0;i<=arr.length-1;i++){
            count ++;
            System.out.println(arr[i]);
            
        }
        System.out.println();
        System.out.println("The length of the given array is "+arr.length);
        


    }
    
}
