package site.DTO;

public class AccountBean {
	private String Id;
	private String Pass;
	private String NickName;
	private String Name;
	private String Email;
	private String PhoneNum;
	
	
	
	public AccountBean(String id, String pass) {
		super();
		Id = id;
		Pass = pass;
	}
	
	public AccountBean(String pass, String nickName, String name, String email, String phoneNum) {
		super();
		Pass = pass;
		NickName = nickName;
		Name = name;
		Email = email;
		PhoneNum = phoneNum;
	}

	public AccountBean(String id, String pass, String nickName, String name, String email, String phoneNum) {
		super();
		Id = id;
		Pass = pass;
		NickName = nickName;
		Name = name;
		Email = email;
		PhoneNum = phoneNum;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getPass() {
		return Pass;
	}


	public void setPass(String pass) {
		Pass = pass;
	}


	public String getNickName() {
		return NickName;
	}


	public void setNickName(String nickName) {
		NickName = nickName;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPhoneNum() {
		return PhoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}



	
	
	
}
