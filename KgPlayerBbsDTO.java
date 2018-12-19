package kgplayerBbs;

public class KgPlayerBbsDTO {
	private String id;
	private String title;
	private String content;
	private String tel;
	private int num;
	private int count;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
		count++;
	}
	public int count() {
		return count;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
	
}
