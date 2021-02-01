package com.xcr.thread.q1;

import java.util.concurrent.*;

/**
 * @Author: xia
 * @Date: 2021/2/1 15:01
 * @Version: v1.0
 */
public class Task implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.sleep(1000);
        return null;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService service = Executors.newCachedThreadPool();
//        Task task = new Task();
//        Future<Object> submit = service.submit(task);
//        Object o = submit.get(1, TimeUnit.SECONDS);
//        System.out.println(o);
//        FutureTask<?> futureTask = new FutureTask<>(new Task());
        Future<?> futureTask = service.submit(new Task());
        System.out.println(futureTask.get());
//        service.submit(futureTask);
        service.shutdown();
    }
}
