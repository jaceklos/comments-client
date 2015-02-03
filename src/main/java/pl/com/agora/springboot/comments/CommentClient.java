package pl.com.agora.springboot.comments;

import java.util.List;
import java.util.concurrent.Future;

import pl.com.agora.api.client.rest.bind.annotation.RestPathVariable;
import pl.com.agora.api.client.rest.bind.annotation.RestRequestBody;
import pl.com.agora.api.client.rest.bind.annotation.RestRequestMapping;

@RestRequestMapping("/comment")
public interface CommentClient {

	@RestRequestMapping("/{articleId}")
    public Future<List<Comment>> getComments(@RestPathVariable("articleId") String articleId);
    
    @RestRequestMapping("/putComment")
    public Future<Comment> load(@RestRequestBody Comment comment);
    
}