package com.xiaomi.threadstudy.Daemon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by zhanghu on 2015/8/1.
 */
//守护线程中不能出现写入文件之类的操作，守护线程会随着JVM一起结束，
//即当主线程退出时，守护线程就会死亡，如果守护线程中存在着写入文件
//之类的操作，那么会导致程序意外终止
public class DaemonThread implements Runnable {
    public void run() {
        System.out.println("进入守护线程" + Thread.currentThread().getName());
        try {
            writeToFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("退出守护线程" + Thread.currentThread().getName());
    }

    private void writeToFile() throws Exception {
        File file = new File(File.separator + "daemon.txt");
        OutputStream os = new FileOutputStream(file, true);

        int count = 0;

        while (count < 999) {
            os.write(("\r\nzhanghu1 " + count).getBytes());
            System.out.println("守护线程" + Thread.currentThread().getName() + "向文件中写入了" +
                    "zhanghu1" + count++ + "次");
            Thread.sleep(1000);
        }
    }
}
