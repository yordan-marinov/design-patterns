import singleton.MySingleton;

import java.util.function.Function;


public class Main {

    public static void main(String[] args) {

        final Function<Runnable, Thread> thread1 = Thread::new;
        thread1.apply(() -> {
            System.out.println("Running from THREAD 1 -----");
            final MySingleton mySingleton1 = MySingleton.getInstance();
            final int identityHashCode1 = System.identityHashCode(mySingleton1);
            System.out.println("Thread1 id: " + identityHashCode1);
        }).start();


        final Function<Runnable, Thread> thread2 = Thread::new;
        thread2.apply(() -> {
            System.out.println("Running from THREAD 2 -----");
            final MySingleton mySingleton2 = MySingleton.getInstance();
            final int identityHashCode2 = System.identityHashCode(mySingleton2);
            System.out.println("Thread2 id: " + identityHashCode2);
        }).start();
    }
}
