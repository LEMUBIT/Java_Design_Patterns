package singletonpattern;

/**
 * This is a class assumed to be desired to have one instance,
 * could be any class
 */
public class SessionManager {
    private static SessionManager sessionManager;
    /**
     * to check if object has been initialized
     */
    private static boolean initialized = false;
    public String text = "Singleton Pattern";

    /**
     * Private constructor to prevent other classes from creating new instances
     */
    private SessionManager() {

    }

    public static SessionManager getInstance() {
        if (initialized) {
            return sessionManager;
        }
        sessionManager = new SessionManager();
        sessionManager.init();
        initialized = true;
        return sessionManager;
    }

    private void init() {
        //code to initialize our Session Manager goes here
    }

}
