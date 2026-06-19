/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
  */
public class setToZero {
    public static void main(String[] args) {
        int arr[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = arr.length;
        int n=arr[0].length;

        int row[]= new int[m];
        int col[]= new int [n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }

        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]==1||col[j]==1){
                    arr[i][j]=0;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}
