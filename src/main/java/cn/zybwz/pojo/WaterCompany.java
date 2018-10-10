package cn.zybwz.pojo;

/**
 * 
 * @author 周倚斌
 * @version 1.0
 * 2018-09-02 11:23
 */
public class WaterCompany {
	private int id;
	private String companyname;
	private String province;
	private String city;
	private String county;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	@Override
	public String toString() {
		return "WaterCompany [id=" + id + ", companyname=" + companyname + ", province=" + province + ", city=" + city
				+ ", county=" + county + "]";
	}
}
