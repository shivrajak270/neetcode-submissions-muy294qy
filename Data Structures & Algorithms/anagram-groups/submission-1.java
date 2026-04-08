class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                Map<String,List<String>>ans=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char []ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String temp=new String(ch);
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
