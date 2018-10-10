package cn.zybwz.pojo;


public class User {

	private Integer id;

    private String username;

    private String password;

    private String deviceID;

	private String company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
    @Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", deviceID=" + deviceID
				+ ", company=" + company + "]";
	}
   
}