class Solution {



   public boolean compare(String a,String b){
    if(a.length()!=b.length()){
        return false;
    }

    int arr[]=new int[26];

    for(int i=0;i<a.length();i++){
        arr[a.charAt(i)-'a'] ++;
        arr[b.charAt(i)-'a'] --;

    }
    for(int c:arr){
        if(c!=0){
            return false;
        }
    }
    return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>>ans=new ArrayList<>();
        int arr[]=new int[strs.length];

        for(int i=0;i<strs.length;i++){
            if(arr[i]==1)
              continue;
              String a=strs[i];
              List<String>tmp=new ArrayList<>();
              tmp.add(a);
              arr[i]=1;
        for(int j=i;j<strs.length;j++){
            String b=strs[j];
            if(compare(a,b) && arr[j]==0){
                tmp.add(b);
                arr[j]=1;
            }
        }
        ans.add(tmp);
        }
        return ans;


        
    }
}
