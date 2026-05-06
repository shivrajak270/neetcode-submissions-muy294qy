class Solution {

    int numpalin(String s,int left,int right){
        int count=0;
        while(left>=0 && right<=s.length()-1){
            if(s.charAt(left)==s.charAt(right)){
                count++;
                left--;
                right++;
            }
            else{
                break;
            }
           
               
        }
        return count;


    }
    public int countSubstrings(String s) {
        int count=0;

        int n=s.length();
        for(int i=0;i<n;i++){
            count+=numpalin(s,i,i);
            count+=numpalin(s,i,i+1);
        }
        return count;
        
    }
}
