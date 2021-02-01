package com.xcr.thread.q1;

/**
 * @Author: xia
 * @Date: 2021/2/1 14:21
 * @Version: v1.0
 */
public class Demo {

    public static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("MyThread");
        }
    }

    public static class MyThread2 implements Runnable{
        @Override
        public void run() {
            System.out.println("MyThread2");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        new Thread(new MyThread2()).start();

        new Thread(() -> {
            System.out.println("匿名内部类");
        }).start();
    }

}
