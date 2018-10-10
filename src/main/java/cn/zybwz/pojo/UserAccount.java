package cn.zybwz.pojo;

import java.sql.Date;

/**
 * 
 * @author 周倚斌
 * @version 1.0
 * 2018-09-02 11:23
 */
public class UserAccount {
	private int id;
	private String CustomerNumber;
	private String CustomerName;
	private String IDCard;
	private String Tell;
	private String VillageName;
	private Date DateRegistration;
	private String WaterType;
	private String Company;
	private String StatusCode;
	private String RegionaNumber;
	private String MacAddress;
	private String UserPassWord;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		CustomerNumber = customerNumber;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getIDCard() {
		return IDCard;
	}
	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
	public String getTell() {
		return Tell;
	}
	public void setTell(String tell) {
		Tell = tell;
	}
	public String getVillageName() {
		return VillageName;
	}
	public void setVillageName(String villageName) {
		VillageName = villageName;
	}
	public Date getDateRegistration() {
		return DateRegistration;
	}
	public void setDateRegistration(Date dateRegistration) {
		DateRegistration = dateRegistration;
	}
	public String getWaterType() {
		return WaterType;
	}
	public void setWaterType(String waterType) {
		WaterType = waterType;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(String statusCode) {
		StatusCode = statusCode;
	}
	public String getRegionaNumber() {
		return RegionaNumber;
	}
	public void setRegionaNumber(String regionaNumber) {
		RegionaNumber = regionaNumber;
	}
	public String getMacAddress() {
		return MacAddress;
	}
	public void setMacAddress(String macAddress) {
		MacAddress = macAddress;
	}
	public String getUserPassWord() {
		return UserPassWord;
	}
	public void setUserPassWord(String userPassWord) {
		UserPassWord = userPassWord;
	}
}
