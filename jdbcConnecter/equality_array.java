package jdbcConnecter;

import java.util.Arrays;

public class equality_array {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,5,3,4,5};
        

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println("Equality match= "+arr1[i]);
                    break;
                }
                else{
                    System.out.println("Equallity not match");
                    break;
                }
            }
        }
    }
    
}
