class Solution {
    public boolean isAnagram(String s, String t) {
          if(s.length()!=t.length())
             return false;

             char[]ch=s.toCharArray();
             char []jk=t.toCharArray();
             Arrays.sort(ch);
             Arrays.sort(jk);
             if(Arrays.equals(ch,jk))
                 return true;

             return false;
    }
}