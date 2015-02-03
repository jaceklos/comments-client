package pl.com.agora.springboot.comments;

public class CommentError {

    private String articleId;
    private String comment;
    private String message;

    public CommentError() {
    }
    
    public CommentError(String articleId, String comment , String message) {
        super();
        this.articleId = articleId;
        this.comment = comment;
        this.message = message;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
