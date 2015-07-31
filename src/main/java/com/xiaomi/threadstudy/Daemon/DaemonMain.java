package com.xiaomi.threadstudy.Daemon;

import java.util.Scanner;

/**
 * Created by zhanghu on 2015/8/1.
 */
public class DaemonMain {
    public static void main(String[] args) {
        System.out.println("进入主线程" + Thread.currentThread().getName());
        DaemonThread daemonThread = new DaemonThread();

        Thread thread = new Thread(daemonThread);
        thread.setDaemon(true);
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.next();

        System.out.println("退出主线程" + Thread.currentThread().getName());
    }
}
