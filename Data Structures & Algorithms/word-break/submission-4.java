class Solution {

  
    public boolean wordBreak(String s, List<String> wordDict) {


        boolean []present=new boolean[s.length()+1];
        present[0]=true;
    


        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(present[j] && wordDict.contains(s.substring(j,i))){
                          present[i]=true;
                }


                  
            }
        }
        return present[s.length()];

        
        

       
        
    } 
}
