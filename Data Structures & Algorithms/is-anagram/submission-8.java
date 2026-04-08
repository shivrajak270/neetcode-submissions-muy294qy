class Solution {
    public boolean isAnagram(String s, String t) {
          if(s.length()!=t.length())
             return false;

             StringBuffer sb=new StringBuffer(s);

             for(int i=0;i<t.length();i++){
                 char ch=t.charAt(i);
                 int n=sb.indexOf(String.valueOf(ch));
                 if(n==-1)
                    return false;
                  else
                 sb.deleteCharAt(n);
             }
             return true;
          


    }
}