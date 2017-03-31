package com.jpknox;

public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        Greeter jeffGreeter = new Greeter("Jeff");
        Greeter michaelGreeter = new Greeter("Michael");

        Thread thread0 = new Thread(jeffGreeter);
        Thread thread1 = new Thread(michaelGreeter);

        thread0.run();
        thread1.run();

        (new Thread(new HelloRunnable())).start();
    }

}