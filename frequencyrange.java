class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num ,0)+1);
        }
        for(int i=1;i<=N;i++){
            int val = map.getOrDefault(i ,0);
            arr[i-1]=val;
        }
    }
}