package xyz.kdeDevelop.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadExecuter {
    private final ExecutorService executorService;

    /**
     * @param threadSize 한번에 실행 가능한 최대 Thread 개수
     */
    public MyThreadExecuter(int threadSize) {
        executorService = Executors.newFixedThreadPool(threadSize);
    }

    /**
     * 대기열에 Work 추가
     * @param work Runnable 형태의 작업 Class
     */
    public void addQueue(Runnable work) {
        executorService.submit(work);
    }


    /**
     * 대기열에 Work 추가
     * @param work Thread 형태의 작업 Class
     */
    public void addQueue(Thread work) {
        executorService.submit(work);
    }

    public void shutdown() {
        executorService.shutdownNow();
    }
}
