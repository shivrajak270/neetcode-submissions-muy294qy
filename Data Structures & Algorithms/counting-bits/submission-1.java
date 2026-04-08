class Solution {

    // int count(int num){
    //     int j=32;
    //     int count=0;
    //     while(j>=0){
    //         int u=num&1;
    //         if(u==1){
    //             count++;
    //         }
    //         num=num>>1;
    //         j--;
    //     }
    //     return count;

    // }

    int count(int num) {
    int count = 0;

    while (num != 0) {
        num = num & (num - 1);
        count++;
    }

    return count;
}
    public int[] countBits(int n) {
        int []ans=new int[n+1];
        int m=0;
        while(m<=n){
            int y=count(m);
            ans[m]=y;
            m++;
        }
        return ans;
    }
}
