package com.kotlin.learning;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //...
            }
        });
        thread.start();
    }
}


//    // Java 8 的 Lambda
//    Thread thread2 = new Thread(() -> {
//        //...
//    });
//        thread.start();










