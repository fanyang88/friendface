package util;

/**
 *
 */
public class DataBaseException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7461246932136310253L;

	public DataBaseException() {
		super();
	}
	
	public DataBaseException(String message) {
		super(message);
	}
	
	public DataBaseException(String message, Throwable cause) {
	    super(message, cause);
	}
	
	public DataBaseException(Throwable cause) {
	    super(cause);
	}
}
