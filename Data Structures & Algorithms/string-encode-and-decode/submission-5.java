class Solution {

    public String encode(List<String> strs) {
        StringBuffer shj=new StringBuffer();

        for(String s : strs){
            shj.append(s.length()).append("#").append(s);
        }
       return shj.toString();
    }

    public List<String> decode(String str) {
     
        int i=0;
        List<String>ans=new ArrayList<>();
        while(i < str.length()){

            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            String word = str.substring(j + 1, j + 1 + length);

            ans.add(word);

            i = j + 1 + length;
        }
        return ans;
    }
}
