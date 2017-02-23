package Concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hadoop on 17-2-21.
 * 多线程下对一个变量进行累加
 */

public class AccountingVol implements Runnable {

    private static ReentrantLock lock = new ReentrantLock();
    private static AccountingVol instance = new AccountingVol();
    private static volatile int count = 0;

    //synchronized
    private static void increase() {

//        lock.lock();
//        count++;
//        lock.unlock();

        synchronized (AccountingVol.class) {
            count++;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            increase();
        }
    }

    public static void main(String[] args) {

        try {
            Long startTime = System.currentTimeMillis();
            Thread t1 = new Thread(instance);
            Thread t2 = new Thread(instance);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            Long endTime = System.currentTimeMillis();
            System.out.println("ElapseTime: " + (endTime - startTime) + " ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("count = " + count);
    }
}
