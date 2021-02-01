package com.xcr.thread.q1;



/**
 * @Author: xia
 * @Date: 2021/2/1 15:55
 * @Version: v1.0
 */
public class Demo04 {

    private void testStateNew() {
        Thread thread = new Thread(() -> {});
        System.out.println(thread.getState());
    }

    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.testStateNew();
    }
}
