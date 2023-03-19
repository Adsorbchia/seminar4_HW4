package org.example.seminar4.hw1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        Stack<Integer> someList =new Stack<>();
        for (int i = 0; i <size ; i++) {
            someList.add(i);
        }
        System.out.println(someList);
        System.out.println(invertedList(someList,size));
    }

    /**
     *
     * @param list исходный список
     * @param num размер списка
     * @return перевернутый список
     */
    private static List invertedList(Stack<Integer> list, int num) {
        LinkedList<Integer> invertedList=new LinkedList<>();
        for (int i = 0; i < num; i++) {
            invertedList.add(i, list.pop());}
        return invertedList;
    }
}
