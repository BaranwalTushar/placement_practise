package jdbcConnecter;

import java.util.Arrays;

public class mergetwoarray {
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,8,6};
        int arr1[] = {4,5,7,2,9};
        for(int i=0;i<arr.length;i++){
             Arrays.sort(arr);
             System.out.print(arr[i]);
             
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            Arrays.sort(arr1);
            System.out.print(arr1[i]);
        }
        int fal = arr.length;
        int sal = arr1.length;
        int result[] = new int[fal + sal];
        System.arraycopy(arr, 0, result, 0,fal);
        System.arraycopy(arr1, 0, result, fal, sal);
        System.out.println();
        System.out.println(Arrays.toString(result));

        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

       
    }
    
}
