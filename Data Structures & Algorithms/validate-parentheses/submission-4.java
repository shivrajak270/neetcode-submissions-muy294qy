class Solution {
    public boolean isValid(String s) {

    Stack<Character>sk=new Stack<>();

    for(char ch:s.toCharArray()){
        if(ch=='[' || ch=='{' || ch =='('){
            sk.push(ch);
        }
        else{
            if(!sk.isEmpty()&&((ch==']' && sk.peek()=='[') || (ch==')' && sk.peek()=='(') || (ch=='}' && sk.peek()=='{'))){
                sk.pop();
            }
            else{
                return false;
            }
        }
    }

  if(sk.isEmpty())
    return true;

    return false;


    }
}