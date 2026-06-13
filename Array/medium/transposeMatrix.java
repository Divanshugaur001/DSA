import java.util.Scanner;

public class transposeMatrix {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int transpose[][]=new int[n][m];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j]=arr[j][i];
            }}
 for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.err.println();
        }
        sc.close();
}}
