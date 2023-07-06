public class DAOException extends Exception {
  
    public DAOException(String message) {
        super(message);
    }
   
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
    
    @Override
    public String toString() {
        String className = getClass().getName();
        String message = getLocalizedMessage();
        return (message != null) ? (className + ": " + message) : className;
    }
}