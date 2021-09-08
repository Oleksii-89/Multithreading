package lesson1;

public class FirstMultithreading {
    public static void main(String[] args) throws InterruptedException{
        MyThread myThread = new MyThread();
        myThread.start();

//        for (int i = 0; i < 1000; i++) {
//            System.out.println("Hello from main Thread");
//        }
        MyThread myThread2 = new MyThread();
        myThread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from lesson1.MyThread" + i + "Hi");
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from lesson1.MyThread" + i);
        }
    }
}
