package pl.com.agora.springboot.comments;

import pl.com.agora.api.client.rest.UriInvocationException;

public class CommentClientException extends UriInvocationException {

    public CommentClientException(String uri, String message, CommentError result, int responseStatus) {
        super(uri, message, result, responseStatus);
    }

    public CommentClientException(String uri, String message, Throwable cause, CommentError result, Integer responseStatus) {
        super(uri, message, cause, result, responseStatus);
    }

    public CommentClientException(String uri, String message) {
        super(uri, message);
    }
    
    @Override
    public CommentError getResult() {
        return (CommentError) super.getResult();
    }
}
