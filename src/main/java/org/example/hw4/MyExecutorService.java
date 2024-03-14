package org.example.hw4;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class MyExecutorService{

    private final ThreadPoolExecutor executor;

    public MyExecutorService(int numThreads) {
        executor = new ThreadPoolExecutor(
                numThreads, numThreads, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>()
        );
    }

    public void execute(Runnable command) {
        executor.execute(command);
    }

    public void shutdown() {
        executor.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return executor.shutdownNow();
    }

    public boolean isShutdown() {
        return executor.isShutdown();
    }

    public boolean isTerminated() {
        return executor.isTerminated();
    }

    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return executor.awaitTermination(timeout, unit);
    }

    public <T> Future<T> submit(Callable<T> task) {
        return executor.submit(task);
    }

    public <T> Future<T> submit(Runnable task, T result) {
        return executor.submit(task, result);
    }

    public Future<?> submit(Runnable task) {
        return executor.submit(task);
    }
}
