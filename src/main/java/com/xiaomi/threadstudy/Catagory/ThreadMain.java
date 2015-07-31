package com.xiaomi.threadstudy.Catagory;

/**
 * Created by Administrator on 2015/7/31.
 */
public class ThreadMain {
    public static void main(String[] args) {
        ExtendsThread extendsThread = new ExtendsThread();
        ImplementRunnable implementRunnable = new ImplementRunnable();

        Thread threadA = new Thread(extendsThread, "I am extends Thread");
        Thread threadB = new Thread(implementRunnable, "I am implements Runnable");

        threadA.start();
        threadB.start();
    }
}
