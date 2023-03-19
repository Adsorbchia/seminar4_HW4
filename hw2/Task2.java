package org.example.seminar4.hw2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkStr(s));}

    /**
     *
     * @param text строка полученная на входе
     * @return правда, если каждая скобка имеет ответную пару "[],{},()", иначе -ложь
     */

    public static boolean checkStr(String text) {
        if (text==null){
            return false;
        }
        int len = text.length();
        int count=0;
        int count2=0;
        int count3=0;
        Stack<Character> strStack=new Stack<>();
        char symbol;
        for (int i = 0; i <len ; i++) {
            symbol=text.charAt(i);
            if (symbol=='(') {
                strStack.push(symbol);
                count+=1;
            }
            else{
                if ((!strStack.isEmpty())&&(symbol==')')){
                    strStack.pop();
                    count= count-1;
                }
            }
            if (symbol=='['){
                strStack.push(symbol);
                count2+=1;
            }
            else{
                if((!strStack.isEmpty())&&(symbol==']')){
                    strStack.pop();
                    count2=count2-1;
                }
            }
            if (symbol=='{'){
                strStack.push(symbol);
                count3+=1;
            }
            else{
                if((!strStack.isEmpty())&&(symbol=='}')){
                    strStack.pop();
                    count3=count3-1;
                }
            }

        }
        if ((strStack.isEmpty())&& (count==0) && (count2==0) && (count3==0)){
            return true;
        }
        else {
            return false;
        }
    }

}



