package com.devix.www;

public class Main {

    public static void main(String[] args) {
        TwoThreadGetName twoThreadGetName = new TwoThreadGetName();
        twoThreadGetName.start();
        for (int i = 0; i < 10; i++) {
            twoThreadGetName.printMsg();
        }
    }

    private static class TwoThreadGetName extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                printMsg();
            }
        }

        private void printMsg() {
            Thread thread = Thread.currentThread();
            String name = thread.getName();
            System.out.println("name = " + name);
        }
    }
}
