package pl.com.agora.springboot.comments;

import pl.com.agora.api.client.rest.RestfulClientProxyBuilder;
import pl.com.agora.api.client.rest.RestfulClientProxyFactory.ProxyConfiguration;

public class CommentClientFactory {

    public CommentClient createSimpleCommentClient(String host, int port) throws Exception {
        return new RestfulClientProxyBuilder().withDefaultConnectTimeout(3000).withDefaultRequestTimeout(1000).withHost(host).withPort(port).withErrorClass(CommentError.class).withDefaultExceptionClass(CommentClientException.class).build(CommentClient.class);        
    }
    
    public CommentClient createCustomCommentClient(String host, int port, ProxyConfiguration config) throws Exception {
        return new RestfulClientProxyBuilder().withDefaultConnectTimeout(3000).withDefaultRequestTimeout(1000).withHost(host).withPort(port).withConfig(config).withErrorClass(CommentError.class).withDefaultExceptionClass(CommentClientException.class).build(CommentClient.class);
    }
}
