public class selection {
        public static void selections(int arr[]){
        int n= arr.length;
        for(int i = 0; i< n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                 min=j;
                }}
                if(min!=i){
                    int temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
                }
            
        }
   
    }
    public static void main(String[] args) {
    int arr[]={2,5,3,4,1};
    selections(arr);
    for (int i : arr) {
        System.out.print(i+" ");
    }
    }
}
