class Solution {
    public int hammingWeight(int n) {
        int m=32;
        int ans=0;

        while(m>0){
            int o=n&1;
            if(o==1){
                ans++;
            }
            n=n>>1;
            m--;
        }
        return ans;
        
    }
}
