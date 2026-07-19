class Solution {
    public int findGCD(int[] nums) {
        int mn=100000;
        int mx=0;
        for(int i=0;i<nums.length;i++){
         if(nums[i]<mn){
            mn=nums[i];
         }
         if(nums[i]>mx){
            mx=nums[i];
        }
        }
        return gcd(mn,mx);
    }
    private int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }return a;
    }
}