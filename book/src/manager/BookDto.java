package manager;

public class BookDto {
	
	private String BookId;	//변수생성
	private String BookName;	//변수생성
	private String BookPrice;	//변수생성
	private String Publiser;	//변수생성
	
	public String getBookId() {	//BookId를 돌려줌
		return BookId;
	}
	
	public void setBookId(String BookId) {	//BookId를 입력받아 BookID에 저장
		this.BookId = BookId;
	}
	
	public String getBookName() {	//BookName을 돌려줌
		return BookName;
	}
	
	public void setBookName(String BookName) {	//BookName을 입력받아 BookName에 저장
		this.BookName = BookName;
	}
	
	public String getBookPrice() {	//BookPrice를 돌려줌
		return BookPrice;
	}
	
	public void setBookPrice(String BookPrice) {	//BookPrice를 입력받아 BookPrice에 저장
		this.BookPrice = BookPrice;
	}
	
	public String getPubliser() {	//BookPubliser를 돌려줌
		return Publiser;
	}
	
	public void setPubliser(String Publiser) {	//Publiser를 입력받아 Publiser에 저장
		this.Publiser = Publiser;
	}
	
	
}
