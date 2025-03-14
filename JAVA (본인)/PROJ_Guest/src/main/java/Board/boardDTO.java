package Board;

import java.sql.Date;

public class boardDTO {

	private int postid;
	private int userid;  
	private String title;    // 글쓰기 내용
	private String content;  // 글쓰기 제목
	private Date postdate;   // 오늘날
	private int viewcount;
	
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	
	
	
	
	
	               
	
	
	
	
	
	
	
	
	
	
}
