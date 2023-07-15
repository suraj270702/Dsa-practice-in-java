class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> se=new HashSet<>();
		for(int i=0;i<nums1.length;i++){
			se.add(nums1[i]);
		}
		List<Integer> li=new ArrayList<>();
		for(int i=0;i<nums2.length;i++){
			int a=nums2[i];
			if(se.contains(a)){
				li.add(a);
				se.remove(a);
			}
		}
		int[] ans=new int[li.size()];
		for(int i=0;i<ans.length;i++){
			ans[i]=li.get(i);
		}
		return ans;
    }
}