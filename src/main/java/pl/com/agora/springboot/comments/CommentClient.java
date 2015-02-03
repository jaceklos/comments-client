package pl.com.agora.springboot.comments;

import java.util.List;
import java.util.concurrent.Future;

import pl.com.agora.api.client.rest.bind.annotation.RestPathVariable;
import pl.com.agora.api.client.rest.bind.annotation.RestRequestBody;
import pl.com.agora.api.client.rest.bind.annotation.RestRequestMapping;
import pl.com.agora.api.client.rest.hash.LBHash;

@RestRequestMapping("/comments")
public interface CommentClient {

	
	@RestRequestMapping("/{articleId}")
    public Future<List<Comment>> getComments(@LBHash @RestPathVariable("articleId") String articleId);
    
    @RestRequestMapping("/putComment")
    public Future<Void> putComment( @LBHash String articleId, @RestRequestBody Comment comment);
    
}
