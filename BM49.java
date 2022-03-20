import java.util.*;

//表达式求值
public class Solution {
    
    public int solve (String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> operStack = new Stack<>();
        int num1, num2, res, index = 0;
        char oper;
        String num = "";
        while(true){
            char c = s.charAt(index);
            if(Character.isDigit(c)){//如果是数字
                num += c;
                if(index == s.length() - 1 || !Character.isDigit(s.charAt(index + 1))){
                    numStack.push(Integer.parseInt(num));
                    num = "";
                }
            }else{//如果是操作符
                if(c == '(' || operStack.isEmpty())
                    operStack.push(c);
                else {
                    if(c == ')'){
                        while(!operStack.isEmpty()){
                            oper = operStack.pop();
                            if(oper != '('){
                                num1 = numStack.pop();
                                num2 = numStack.pop();
                                res = calculate(num2, num1, oper);
                                numStack.push(res);
                            }else break;
                        }
                    }
                    else if(priority(c) <= priority(operStack.peek())){
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = calculate(num2, num1, oper);
                        numStack.push(res);
                        operStack.push(c);
                    }else
                        operStack.push(c);
                }
            }
            index++;
            if(index >= s.length())break;
        }
        while(true){
            if(operStack.isEmpty())break;
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = calculate(num2, num1, oper);
            numStack.push(res);
        }
        return numStack.pop();
    }
    
    public int priority(char c){
        if(c == '*' || c == '/')
            return 1;
        else if(c == '+' || c == '-')
            return 0;
        else 
            return -1;
    }
    
    public int calculate(int num1, int num2, char oper){
        int res = 0;
        switch(oper){
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            default: break;
        }
        return res;
    }
    
}