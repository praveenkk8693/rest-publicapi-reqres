package rest.publicapi.exception;

public class RestException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RestException() {
		super();
	}
	public RestException(String message) {
		super(message);
	}
	
	public RestException(String message, Throwable error) {
		super(message, error);
	}
	
	public RestException(Throwable error) {
		super(error);
	}
	

}
