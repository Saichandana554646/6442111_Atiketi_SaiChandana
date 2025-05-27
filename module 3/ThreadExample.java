class MessageThread extends Thread {
    private String message;

    public MessageThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - " + i);
            try {
                Thread.sleep(500); // Sleep 0.5 sec
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new MessageThread("Thread 1");
        Thread t2 = new MessageThread("Thread 2");

        t1.start();
        t2.start();
    }
}
