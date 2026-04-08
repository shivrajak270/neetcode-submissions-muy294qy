class Solution {

   public String whatever(String j){

    int freq[]=new int[26];

    for(int i=0;i<j.length();i++){
        freq[j.charAt(i)-'a']++;
    }
    StringBuilder sb=new StringBuilder();
    for(int k:freq){
            sb.append(k);
            sb.append('#');
        }
    



    

    return sb.toString();
}
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String,List<String>>sh=new HashMap<>();
      for(String jk:strs){
         String temp=whatever(jk);
         if(sh.containsKey(temp)){
            sh.get(temp).add(jk);
         }
         else{
    List<String> list = new ArrayList<>();
    list.add(jk);
    sh.put(temp, list);
}
      }

      List<List<String>> gh = new ArrayList<>(sh.values());

      return gh;        
    }
}
