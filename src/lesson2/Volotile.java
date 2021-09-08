package lesson2;

import java.util.Scanner;

public class Volotile {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThread extends Thread{
    //cash coherency
    private volatile boolean running = true;
    int i = 0;
    public void run() {
        while (running){
            System.out.println("Hello" + i);
            try {
                Thread.sleep(100);
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){
        this.running = false;
    }
}
