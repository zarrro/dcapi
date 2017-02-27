package clinic.dermal.model;

public class StorageFileNotFoundException extends StorageException {

    /**
	 * default initialization
	 */
	private static final long serialVersionUID = 1L;

	public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}