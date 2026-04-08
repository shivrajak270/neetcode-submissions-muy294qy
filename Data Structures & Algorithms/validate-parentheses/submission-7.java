class Solution {
    public boolean isValid(String s) {
        
             Map<Character,Character>hj=new HashMap<>();
             hj.put(')','(');
             hj.put(']','[');
             hj.put('}','{');
             Stack<Character>jk=new Stack<>();


             for(char ch:s.toCharArray()){
                if(hj.containsValue(ch)){
                    jk.add(ch);
                }
                else{
                    if(!jk.isEmpty() &&(jk.peek()==hj.get(ch))){
                        jk.pop();
                    }
                    else{
                        return false;
                    }
                }
             }
             if(!jk.isEmpty())
               return false;

             return true;  
    }
}