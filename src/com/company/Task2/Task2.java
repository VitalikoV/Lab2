package com.company.Task2;

import com.company.Task;

public class Task2 implements Task {
    @Override
    public void executeTask() throws Exception {
        CustomStack stack = new CustomStack();
        System.out.println("Stack size before adding: " + stack.size());
        stack.push(10);
        stack.push(20);
        stack.push("thirty");
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Stack size after adding: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());

        System.out.println("Current: " + stack.showCurrent());

        System.out.println("Deletion of current: " + stack.deleteCurrent());

        stack.change(1, "forty");
        stack.displayStack();
        System.out.println("Get value from Stack: " + stack.get(0));
    }
}
