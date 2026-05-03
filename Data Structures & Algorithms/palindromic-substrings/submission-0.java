class Solution {



    boolean ispalin(String s,int left,int right){
        if(left==right)
           return true;
        while(left<=right){
            if(s.charAt(left)!=(s.charAt(right)))
              return false;
              left++;
              right--;
        }
        return true;
    }

    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                boolean ispalin=ispalin(s,i,j);
                if(ispalin){
                    count++;
                }
            }

        }
        return count;
        
    }
}
