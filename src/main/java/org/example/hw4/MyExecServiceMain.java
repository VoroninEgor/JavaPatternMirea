package org.example.hw4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MyExecServiceMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyExecutorService myExecutorService = new MyExecutorService(2);

        myExecutorService.execute(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("My executor service Runnable");
            }
        });

        System.out.println("Hello World!");

        Future future = myExecutorService.submit(new Callable(){
            public Object call() throws Exception {
                Thread.sleep(1000);
                System.out.println("My executor service Callable");
                return "myExecutorService";
            }
        });
        System.out.println("Hi from : " + future.get());


        myExecutorService.shutdown();

    }
}
