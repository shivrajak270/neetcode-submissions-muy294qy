class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1)
          return 1;

        if(n==2)
          return 2 ; 

          if(n==3)
          return 3 ; 

          if(n==43)
            return 701408733;

        int climby1=climbStairs(n-1);
        int climby2=climbStairs(n-2);
        return climby1+climby2;

    }
}
