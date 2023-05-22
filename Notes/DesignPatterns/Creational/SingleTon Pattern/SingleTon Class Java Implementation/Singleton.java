public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here
    private Singleton() {
    }

    /**
     * @return
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    // other useful methods here
}