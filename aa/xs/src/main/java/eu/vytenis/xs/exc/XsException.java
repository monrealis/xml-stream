package eu.vytenis.xs.exc;

public class XsException extends RuntimeException {
	private static final long serialVersionUID = -3374333368223664116L;

	public XsException() {
	}

	public XsException(String message) {
		super(message);

	}

	public XsException(Throwable throwable) {
		super(throwable);

	}

	public XsException(String message, Throwable throwable) {
		super(message, throwable);

	}
}
