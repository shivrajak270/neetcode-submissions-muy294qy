class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>>gh=new HashMap<>();

        for(String sh:strs){
            char []tmp=sh.toCharArray();
            Arrays.sort(tmp);
            String hj=new String(tmp);
            if(gh.containsKey(hj)){
                gh.get(hj).add(sh);
            }
            else{
                ArrayList ghj=new ArrayList<>();
                ghj.add(sh);
                gh.put(hj,ghj);
            }
        }
        List<List<String>>ans=new ArrayList<>(gh.values());

        return ans;

        


        
    }
}
