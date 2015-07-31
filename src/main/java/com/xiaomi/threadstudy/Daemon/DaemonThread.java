package com.xiaomi.threadstudy.Daemon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by zhanghu on 2015/8/1.
 */
//�ػ��߳��в��ܳ���д���ļ�֮��Ĳ������ػ��̻߳�����JVMһ�������
//�������߳��˳�ʱ���ػ��߳̾ͻ�����������ػ��߳��д�����д���ļ�
//֮��Ĳ�������ô�ᵼ�³���������ֹ
public class DaemonThread implements Runnable {
    public void run() {
        System.out.println("�����ػ��߳�" + Thread.currentThread().getName());
        try {
            writeToFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("�˳��ػ��߳�" + Thread.currentThread().getName());
    }

    private void writeToFile() throws Exception {
        File file = new File(File.separator + "daemon.txt");
        OutputStream os = new FileOutputStream(file, true);

        int count = 0;

        while (count < 999) {
            os.write(("\r\nzhanghu1 " + count).getBytes());
            System.out.println("�ػ��߳�" + Thread.currentThread().getName() + "���ļ���д����" +
                    "zhanghu1" + count++ + "��");
            Thread.sleep(1000);
        }
    }
}
