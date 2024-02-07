package singleton;

public class MySingleton {

    private volatile static MySingleton INSTANCE = null;

    // In order to mess up with the threads
    private static boolean firstThread = true;

    public static MySingleton getInstance() {
        if (INSTANCE == null) {
            // Creating and Thread safe instantiating of only one instance of MySingleton
            synchronized (MySingleton.class) {
                if (INSTANCE == null) {
                    // Can be created two or more different instances of MySingleton if is not synchronized
                    if (firstThread) {
                        firstThread = false;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    INSTANCE = new MySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
