package Threads;

/**
 * Created by gurpreet on 30/1/16.
 *
 * Thread()
 Thread(Runnable traget)
 Thread(Runnable target, String name)
 Thread(String name)
 Thread(ThreadGroup group, Runnable Target)
 Thread(ThreadGroup group, Runnable Target, String name)
 Thread(ThreadGroup group, Runnable Target, String name, long stackSize)
 Thread(ThreadGroup group, String name)
 */

class RaceDemo {
    public static void main(String[] args) {
        Racer racer = new Racer();
        Thread tortoiseThread = new Thread(racer, "Tortoise");
        Thread hareThread = new Thread(racer, "Hare");
        //Race to start. tell threads to start
        tortoiseThread.start();
        hareThread.start();

    }
}