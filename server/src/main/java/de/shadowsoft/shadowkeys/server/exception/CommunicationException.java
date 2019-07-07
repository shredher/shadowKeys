package de.shadowsoft.shadowkeys.server.exception;

public class CommunicationException extends Exception {
    public CommunicationException() {
    }

    public CommunicationException(final String message) {
        super(message);
    }

    public CommunicationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CommunicationException(final Throwable cause) {
        super(cause);
    }

    public CommunicationException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
    
    