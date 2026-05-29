class Solution {
    public boolean isValid(String s) {

        int left=0;
        int right=s.length()-1;
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
                else
                   hj.push(leftchar)  ;   
            }
            left++;
        }
        if(!hj.isEmpty())
           return false;
        return true;
        
    }
}
