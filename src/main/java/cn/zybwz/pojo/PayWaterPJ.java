package cn.zybwz.pojo;

/**
 * 此pojo用于封装数据库的用户支付订单表数据
 * @author 周倚斌
 * @version 1.0
 * 2018-09-02 11:22
 */
public class PayWaterPJ {

	private String CustomerNumber;
	private String PayMoney;
	private String PayTime;
	private String PayWay;
	private String Company;
	private String Synchronize;
	private String OrderNumber;
	private String RegionalName;
	private String IDCard;
	private String WaterType;
	private String CustomerName;
	
	public String getRegionalName() {
		return RegionalName;
	}
	public void setRegionalName(String regionalName) {
		RegionalName = regionalName;
	}
	public String getIDCard() {
		return IDCard;
	}
	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
	public String getWaterType() {
		return WaterType;
	}
	public void setWaterType(String waterType) {
		WaterType = waterType;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		CustomerNumber = customerNumber;
	}
	public String getPayMoney() {
		return PayMoney;
	}
	public void setPayMoney(String payMoney) {
		PayMoney = payMoney;
	}
	public String getPayTime() {
		return PayTime;
	}
	public void setPayTime(String payTime) {
		PayTime = payTime;
	}
	public String getPayWay() {
		return PayWay;
	}
	public void setPayWay(String payWay) {
		PayWay = payWay;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getSynchronize() {
		return Synchronize;
	}
	public void setSynchronize(String synchronize) {
		Synchronize = synchronize;
	}
	public String getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}
	
	
	
	
}
