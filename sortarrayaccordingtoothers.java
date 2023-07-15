class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Your code here
        int count=0;
        int arr[]=new int[N]; 
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(A1[j]==A2[i]){
                   arr[count++]=A2[i];
                   A1[j]=-1;
                }
            }
        }
        Arrays.sort(A1);
        for(int i=0;i<N;i++){
            if(A1[i]>-1){
                arr[count++]=A1[i];
            }
        }

        return arr;
    }
}