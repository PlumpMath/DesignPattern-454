package Concurrency;

/**
 * Created by hadoop on 17-2-21.
 * 多线程下对一个变量进行累加
 */

public class AccountingVol implements Runnable {

    private static AccountingVol instance = new AccountingVol();
    private static volatile int count = 0;

    private static synchronized void increase() {
        count++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            increase();
        }
    }

    public static void main(String[] args) {

        try {
            Thread t1 = new Thread(instance);
            Thread t2 = new Thread(instance);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("count = " + count);
    }
}
