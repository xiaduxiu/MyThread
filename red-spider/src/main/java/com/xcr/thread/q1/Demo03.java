package com.xcr.thread.q1;


/**
 * @Author: xia
 * @Date: 2021/2/1 15:55
 * @Version: v1.0
 */
public class Demo03 {

    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("group1") {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName() + ": " + e.getMessage());
            }
        };

        new Thread(threadGroup, new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("测试异常");
            }
        }).start();
    }
}
