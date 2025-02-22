package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        new Task06Main().printMethodName();

    }

    void printMethodName() {
        StackTraceElement[] method = Thread.currentThread().getStackTrace();
        // 0 - это сам метод getStackTrace();
        // 1 - это вызываемый метод (calledMethod);
        // 2 - это вызывающий (родительский) метод (callerMethod).
        System.out.print(method[2].getMethodName());
    }

}