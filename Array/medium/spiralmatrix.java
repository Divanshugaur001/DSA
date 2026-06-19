/*
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

*/

import java.util.ArrayList;

public class spiralmatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int m=arr.length;
        int n=arr[0].length;
        ArrayList<Integer> l= new ArrayList<>();
        int strtrow=0;
        int endrow=m-1;
        int strtcol=0;
        int endcol=n-1;

        while (strtcol<=endcol && strtrow<=endrow ) {

        for(int i=strtcol;i<=endcol;i++){
            l.add(arr[strtrow][i]);
           
        }
         strtrow++;
         
        for(int i=strtrow;i<=endrow;i++){
            l.add(arr[i][endcol]);
        }
        endcol--;

if(strtrow<=endrow){
    for(int j=endcol;j>=strtcol;j--){
        l.add(arr[endrow][j]);
    }
    endrow--;
}

if(strtcol<=endcol){
    for(int j=endrow;j>=strtrow;j--){
        l.add(arr[j][strtcol]);
    }
    strtcol++;
}

    }
        for(int e:l){
            System.out.print(e+" ");
        }
    }
}
