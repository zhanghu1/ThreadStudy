package com.xiaomi.threadstudy.Catagory;

/**
 * Created by Administrator on 2015/7/31.
 */
public class ImplementRunnable implements Runnable{
    volatile boolean runFlag = true;
    public void run() {
        int count = 0;
        while (runFlag) {
            System.out.println(Thread.currentThread().getName() + " : " + count++);
            if (1000 == count) {
                runFlag = false;
            }
        }
    }
}
