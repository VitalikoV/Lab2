package com.company.Task2;

import java.util.EmptyStackException;

public class CustomStack<T> {
    private CustomNode top;
    private int size;

    public void push(T data) {
        CustomNode tempNode = new CustomNode(data);
        tempNode.setNext(top);
        top  = tempNode;
        size++;
    }

    public T deleteCurrent() throws Exception {
        if(isEmpty())
            throw new Exception("Can't be reached");


        T result = (T) top.getData();
        top = top.getNext();
        size--;
        return result;
    }

    public T showCurrent() throws Exception {
        if(isEmpty())
            throw new Exception("Can't be reached");

        return (T) top.getData();
    }
    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void displayStack() {
        CustomNode current = top;

        System.out.println("Current Custom Stack: ");
        while (current != null) {
            System.out.print(current.getData()+" ");

            current = current.getNext();
        }
        System.out.println();

    }

    public T get(int distance){
        CustomNode current = top;

        while (current.getNext() != null && distance > 0) {

            current = current.getNext();
            distance--;
        }
        return (T) current.getData();
    }

    public void delete(int distance){
        CustomNode current = top;

        while (current.getNext() != null && distance > 0) {

            current = current.getNext();
            distance--;
        }
    }

    public void change(int distance, T value){
        CustomNode current = top;

        while (current.getNext() != null) {
            if (distance == 0) {
                current.setData(value);
            }
            current = current.getNext();
            distance--;
        }
    }
}
