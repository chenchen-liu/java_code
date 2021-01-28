package 测试;

import java.util.Stack;

/*
*
* 题目描述：给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
*
* */
class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            }else{     //字符串当前为右括号元素
                if(stack.empty()){
                    return false;
                }else{
                    char ch =  stack.peek();
                    if((ch == '(' && c == ')') || (ch == '{' && c == '}') ||(ch == '[' && c == ']')){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }
}