class Solution {
    public int reverseBits(int n) {
        int m=0;
        int i=32;

        while(i!=0){
            int lastbit=n&1;
            m=m<<1;
            m=(m)|(lastbit);
            n=n>>1;
            i--;

        }
        return m;
        
    }
}
