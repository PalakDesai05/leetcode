class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        int n=grid.length;
        int total=n*n;
        HashSet <Integer> h=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int val=grid[i][j];
                if(h.contains(val)){
                     ans[0] = val;
                }else{
                    h.add(val);
                }
            }
        }
        for (int i = 1; i <= total; i++) {
            if (!h.contains(i)) {
                ans[1] = i; 
                break;
            }
        }
        return ans;
    }
}