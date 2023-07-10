public class BDExcepcionDAO extends Exception {
  
    public BDExcepcionDAO(String message) {
        super(message);
    }
   
    public BDExcepcionDAO(String message, Throwable cause) {
        super(message, cause);
    }
    
    @Override
    public String toString() {
        String className = getClass().getName();
        String message = getLocalizedMessage();
        return (message != null) ? (className + ": " + message) : className;
    }
}