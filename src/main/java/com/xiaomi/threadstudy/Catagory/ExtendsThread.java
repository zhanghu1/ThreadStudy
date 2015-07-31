package com.xiaomi.threadstudy.Catagory;

/**
 * Created by Administrator on 2015/7/31.
 */
public class ExtendsThread extends Thread {
   volatile boolean runFlag = true;
    @Override
    public void run() {
//        super.run();
        int count = 0;
        while (runFlag) {
            System.out.println(getName() + " : " + count++);
            if (1000 == count) {
                runFlag = false;
            }
        }
    }
}
