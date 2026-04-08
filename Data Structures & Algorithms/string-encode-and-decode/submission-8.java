class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb=new StringBuilder();

        for(String hj:strs){
            sb.append(hj.length()).append("#").append(hj);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
    List<String>gh=new ArrayList<>();
    int j=0;
    int i=0;
    while(i<str.length()){
        while(str.charAt(j)!='#'){
            j++;
        }
        int num = Integer.parseInt(str.substring(i, j));

        gh.add(str.substring(j+1,j+num+1));
        i=j+num+1;
        j=i;
    }
    return gh; 


    }
}
