package sample.mybatis.domain;

public class User {

	private int id;
	private String email;
	private String userName;
	
	public User() {}

    public User(String email, String userName) {
        this.email = email;
        this.userName = userName;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
