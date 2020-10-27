package offer;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

//最长字符串子串
public class Offer01 {
    public static void main(String[] args) throws InterruptedException {


        ReentrantLock reentrantLock = new ReentrantLock();
        ReentrantLock reentrantLockT = new ReentrantLock();
        reentrantLock.lock();

        getStart();
        Thread.sleep(3000);
        System.out.println("main=====");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int end = (int)Math.pow(10,n);
        for (int i = 0; i < end; i++) {
            System.out.print(String.format("%0"+n+"d",i)+" ");
        }
    }

    private static void getStart() {
        synchronized (Object.class){

        }
        new Thread(new Runnable() {

            @Override
            public void run() {
                int e=1/0;

            }
        }).start();
    }

//        AtomicInteger atomicInteger = new AtomicInteger();
//        int i = atomicInteger.incrementAndGet();
//
//
//        synchronized (new Object()){
//
//        }

}
