package tp.login;

import java.util.Date;

public class UserBean {

	private String login;
	private Date loginDate;
	
	public UserBean(String login, Date loginDate) {
		super();
		this.login = login;
		this.loginDate = loginDate;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public UserBean() {
		super();
	}

}
