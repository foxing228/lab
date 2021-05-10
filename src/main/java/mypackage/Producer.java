package mypackage;

import java.util.Random;

public class Producer extends Thread {

//    public Producer(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        Random r = new Random();
//
//        while (true) {
//            synchronized (Application.bucket) {
//                if (Application.bucket.size() < 100) {
//                    int n = r.nextInt(1000);
//                    Application.bucket.add(n);
//                    System.out.println(Thread.currentThread().getName()
//                            + " added value " + n + " to the bucket");
//                }
//            }
//        }
//    }
}