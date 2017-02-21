package Concurrency;

/**
 * Created by hadoop on 17-2-21.
 * Java 线程优先级测试
 */
public class PriorityDemo {

    public static class HighPriority extends Thread {
        static int count = 0;

        @Override
        public void run() {
            while (true) {
                synchronized (PriorityDemo.class) {
                    count++;
                    if (count > 80000000) {
                        System.out.println("High Priority is complete!");
                        break;
                    }
                }
            }
        }
    }

    public static class LowPriority extends Thread {
        static int count = 0;

        @Override
        public void run() {
            while (true) {
                synchronized (PriorityDemo.class) {
                    count++;
                    if (count > 80000000) {
                        System.out.println("Low Priority is complete!");
                        break;
                    }
                }
            }
        }
    }

    public static class NormalPriority extends Thread {
        static int count = 0;

        @Override
        public void run() {
            while (true) {
                synchronized (PriorityDemo.class) {
                    count++;
                    if (count > 80000000) {
                        System.out.println("Normal Priority is complete!");
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Multi Thread Priority Test");
        Thread high = new HighPriority();
        Thread normal = new NormalPriority();
        Thread low = new LowPriority();
        high.setPriority(Thread.MAX_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);
        high.start();
        normal.start();
        low.start();
    }
}
