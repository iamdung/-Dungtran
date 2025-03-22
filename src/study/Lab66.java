package study;
public class Lab66 {
    public static void main(String[] args) {
        int[][] matA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };       
        int[][] matB = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };       
        int[][] mat = new int[matA.length][matA[0].length];       
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[0].length; j++) {
                mat[i][j] = matA[i][j] + matB[i][j];
            }
        }        
        System.out.println("Result:");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
