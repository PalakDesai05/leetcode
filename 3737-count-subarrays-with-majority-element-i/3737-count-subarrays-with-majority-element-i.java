class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
                            int cnt=0;
            for (int j=i;j<=n-1;j++){
                    if(nums[j]==target){
                        cnt++;
                }
                   int l=j-i+1;
                  if(cnt>l/2){
                    res++;
                  }
            }
        }
        return res;
    }
}