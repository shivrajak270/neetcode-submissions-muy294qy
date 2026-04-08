class Solution {

    public String whatever(String s){

   int[]hj=new int[26];
   for(char hh:s.toCharArray()){
    hj[hh-'a']++;
   }
   char g='a';
   StringBuilder sb=new StringBuilder("");
   for(int j:hj){
    sb.append(g);
    sb.append(j);
    g++;
   }
      return sb.toString();


    }
    public List<List<String>> groupAnagrams(String[] strs) {
                Map<String,List<String>>ans=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String temp=whatever(strs[i]);
            if(ans.containsKey(temp)){
               List<String>contain=ans.get(temp);
               contain.add(strs[i]);
            }
            else{
    List<String> list = new ArrayList<>();
    list.add(strs[i]);
    ans.put(temp,list);
}
        }
        List<List<String>>ahj=new ArrayList<>();
       for(List<String>gh:ans.values()){
        ahj.add(gh);
       }
       return ahj;
    }
}
