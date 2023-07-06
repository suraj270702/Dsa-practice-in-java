import java.util.*;
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        if(m>n) return -1;
        long ans = Long.MAX_VALUE;
        
        for(int i=0;i<=n-m;i++){
            int temp = a.get(i+m-1) - a.get(i);
            ans = Math.min(ans,temp);
            
        }
        return ans;
    }
}
