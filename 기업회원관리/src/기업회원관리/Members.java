package 기업회원관리;

import java.sql.Date;

public class Members {
	private int id;
	private String username;
	private String password;
	private String name;
	private String email;
	private String dept_no;
	private String dept_name;
	private String position;
	
	//생성자.
	public Members() {}
	public Members(int id, String username, String password , String name,  String email, String dept_no, String dept_name, String position) {
		super(); //부모 클래스
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.dept_no = dept_no;
		this.dept_name = dept_name;
		this.position = position;
	}
	
	//getter and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept_no() {
		return dept_no;
	}
	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
