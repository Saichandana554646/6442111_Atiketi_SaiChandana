public class VirtualThreadsDemo {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Hello from virtual thread: " + Thread.currentThread());

        for (int i = 0; i < 1000; i++) {
            Thread.startVirtualThread(task);
        }
    }
}