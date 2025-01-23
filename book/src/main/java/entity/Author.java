package entity;

public class Author {
	private int AuthorId;
	private String AuthorName;

	public Author() {

	}

	public Author(int authorId, String authorName) {
		super();
		AuthorId = authorId;
		AuthorName = authorName;
	}

	public int getAuthorId() {
		return AuthorId;
	}

	public void setAuthorId(int authorId) {
		AuthorId = authorId;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	@Override
	public String toString() {
		return "Author [AuthorId=" + AuthorId + ", AuthorName=" + AuthorName + "]";
	}
	
	

}
