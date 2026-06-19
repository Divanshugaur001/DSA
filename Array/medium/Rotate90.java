/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
*/

public class Rotate90 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int  m=arr.length;
        int n=arr[0].length;

        //transpose


for(int i=0;i<m;i++){
    for(int j=i+1;j<n;j++){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
}


//reverse
for(int i=0;i<m;i++){
    int start=0;
    int end=m-1;
    while(start<=end){
        int temp=arr[i][start];
        arr[i][start]=arr[i][end];
        arr[i][end]=temp;
        start++;
        end--;
    }
}

    for(int e=0;e<m;e++){
        for(int f=0;f<n;f++){
        System.out.print(arr[e][f]+" ");
    }
    }

    }
}
