class Solution {
    public boolean isAnagram(String s, String t){
        char[]sg=s.toCharArray();
        char[]tt=t.toCharArray();

         Arrays.sort(sg);
        Arrays.sort(tt);

        String one=new String(sg);
        String two=new String(tt);

       
        if(one.equals(two))
          return true;

    return false;    
    }
}