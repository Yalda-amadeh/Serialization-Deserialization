package serialization;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
	public User(String username, String password, int cardNum) {
		super();
		this.username = username;
		this.password = password;
		this.cardNum = cardNum;
	}
	private static final long serialVersionUID = 1L;
	
	private String username;
	transient private String password;
	transient private int cardNum;
	
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
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", cardNum=" + cardNum
				+ "]";
	}
	

}
