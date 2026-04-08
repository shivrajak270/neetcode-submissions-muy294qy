class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        int n=strs.length;
        if(n==1){
            List<String>tmp=new ArrayList<>();
            tmp.add(strs[0]);
            ans.add(tmp);
            return ans;
        }
        int []hash=new int[n];
        for(int i=0;i<n;i++){
            if(hash[i]==1) continue;
            List<String>temp=new ArrayList<>();
            char[]first=strs[i].toCharArray();
             Arrays.sort(first);
              temp.add(strs[i]);
                hash[i]=1;
          for(int j=i+1;j<n;j++){    
            if(hash[j]==1) continue;         
            char[]second=strs[j].toCharArray();
            Arrays.sort(second);
            if(Arrays.equals(first,second)){
                hash[j]=1;
                temp.add(strs[j]);
            }
          }
           ans.add(temp);
        }
          
        return ans;
        
        
    }
}
