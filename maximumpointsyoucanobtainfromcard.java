class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        
        int maxScore = sum;
        int n = cardPoints.length;
        
        for (int i = 0; i < k; i++) {
            sum -= cardPoints[k - i - 1];
            sum += cardPoints[n - i - 1];
            maxScore = Math.max(maxScore, sum);
        }
        
        return maxScore;
    }
       
}