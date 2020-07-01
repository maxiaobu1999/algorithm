package com.malong;

import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<Integer>();
        queue.push(123);
        System.out.println(queue.pop());

    }
}

class CustomQueue<E> {
    private Stack<E> stack1 = new Stack<E>();
    private Stack<E> stack2 = new Stack<E>();

    public void push(E node) {
        stack1.add(node);
    }

    public E pop() {
        // stack1元素导入stack2中
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        // stack2 出栈
        E first = stack2.pop();
        // stack2 导入 stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return first;
    }

}
