package jdbcConnecter;

public class multiplymatrix {
    public static void main(String[] args) {
        int a[][] = {{2,2,2},{2,2,2},{2,2,2}};
        int b[][] = {{2,2,2},{2,2,2},{2,2,2}};

        int c[][] = new int[3][3];

        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            c[i][j] = a[i][j] * b[i][j];
            System.out.print(c[i][j] + " ");
        }
        System.out.println();    
        }
    }

    
    }
   
    


