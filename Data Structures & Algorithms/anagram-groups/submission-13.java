class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>>tmp=new HashMap<>();
        

        for(String sh:strs){
             int ch[]=new int [26];
            for(int i=0;i<sh.length();i++){
                ch[sh.charAt(i)-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<26;j++){
                if(ch[j]!=0){
                    sb.append((char)'a'+j);
                    sb.append(ch[j]);
                    sb.append('#');
                }
            }

            String notyet=sb.toString();

            if(tmp.containsKey(notyet)){
                tmp.get(notyet).add(sh);
            }
            else{
                List<String>jj=new ArrayList<>();
                    jj.add(sh);      
                tmp.put(notyet,jj);
            }
        }

        return new ArrayList<>(tmp.values());



        
    }
}
