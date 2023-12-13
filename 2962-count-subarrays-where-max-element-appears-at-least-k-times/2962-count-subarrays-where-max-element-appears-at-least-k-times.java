class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; ++i){
            maxi = Math.max(nums[i],maxi);
        }
        int i = 0, j = 0;
        int cnt = 0;
        long ans = 0;
        while( j < n){
            if(nums[j] == maxi) {
                cnt++;
            }
        
        if( cnt >= k){
            while (cnt >= k){
                ans += n - j;
                if (nums[i] == maxi){
                    cnt--;
                }
                i++;
            }
        }
        j++;
        }
        return ans;
    }
}