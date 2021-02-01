package com.xcr.thread.q1;

import java.util.stream.IntStream;

/**
 * @Author: xia
 * @Date: 2021/2/1 15:55
 * @Version: v1.0
 */
public class Demo02 {

    public static class T1 implements Runnable{

        @Override
        public void run() {
            System.out.println(String.format("当前执行的线程是：%s，优先级：%d",
                    Thread.currentThread().getName(),
                    Thread.currentThread().getPriority()));
        }
    }


    public static void main(String[] args) {
//        new Thread(()->{
//            System.out.println("线程组：" + Thread.currentThread().getThreadGroup().getName());
//            System.out.println("线程名：" + Thread.currentThread().getName());
//        }).start();
//
//        System.out.println("执行线程组：" + Thread.currentThread().getThreadGroup().getName());
//        System.out.println("执行线程名：" + Thread.currentThread().getName());
        IntStream.range(1, 10).forEach( i -> {
            Thread thread = new Thread(new T1());
            thread.setPriority(i);
            thread.start();
        });

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);
    }
}
