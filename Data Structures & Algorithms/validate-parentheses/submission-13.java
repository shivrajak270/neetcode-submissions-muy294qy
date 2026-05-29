class Solution {
    public boolean isValid(String s) {

        int left=0;
        int right=s.length()-1;

        Map<Character,Character>gh=new HashMap<>();
        gh.put('(',')');
        gh.put('[',']');
        gh.put('{','}');
        Stack<Character>hj=new Stack<>();
        while(left<=right){
            if(s.charAt(left)=='(' || s.charAt(left)=='{' || s.charAt(left)=='['){
                hj.push(s.charAt(left));
            }
            else{
                if(hj.isEmpty())
                   return false;

                char temp=hj.peek();
                char leftchar=s.charAt(left);
                if((temp=='(' && leftchar==')') || (temp=='[' && leftchar==']') || (temp=='{' && leftchar=='}'))
                      hj.pop();
                else{
                    return false;
                }    
            }
            left++;
        }
        if(!hj.isEmpty())
           return false;
        return true;
        
    }
}
