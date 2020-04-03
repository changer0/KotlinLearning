package com.kotlin.learning;

public class Main {
    public static void main(String[] args) {

        int count;
        for (count = 0; count < 10; count++) {
            System.out.println(count);
        }



        //StringUtils.Companion.isEmpty("");
        //new TestClass().putNum(Integer.valueOf(123));
        //new AKt().putNum(Integer.valueOf(123));
    }



    static class TestClass {
        public void putNum(int num) {
            boolean var2 = false;
            System.out.println(num);
        }

        // $FF: synthetic method
        // $FF: bridge method
        public void putNum(Integer var1) {
            this.putNum(var1);
        }
    }

}


//    // Java 8 的 Lambda
//    Thread thread2 = new Thread(() -> {
//        //...
//    });
//        thread.start();










