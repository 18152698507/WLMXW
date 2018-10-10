package cn.zybwz.utils;

import java.util.Random;

/**
 * 微信工具类
 * @author 周倚斌
 * @version 1.0
 * 2018-09-02 10:34
 */
public class WXUtil {
	public static char[] str= {'a','b','c','d','e','f','g','h','i','j','k','l',
							   'n','m','o','p','q','r','s','t','u','v','w','x',
							   'y','z','1','2','3','4','5','6','7','8','9','0',
							   'A','B','C','D','E','F','G','H','I','J','K','L',
							   'N','M','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	/**
	 * 获得微信加签字符串
	 * @param stringA 需要加签的字符串
	 * @return 生成的微信加签字符串
	 */
	public static String getSign(String stringA) {
		String stringSignTemp=stringA+"&key=e1Wx2017HN1cd5Wm279ZJmQl109Kr7cZ"; //注：key为商户平台设置的密钥key

				return MD5Util.MD5Encode(stringSignTemp, "UTF-8").toUpperCase();//注：MD5签名方式

				//String sign=hash_hmac("sha256",stringSignTemp,key).toUpperCase();
	}
	
	/**
	 * 获得随机字符串
	 * @return 生成的随机字符串
	 */
	public static String getNonceStr() {
		String noncestr="";
		for(int i=0;i<20;i++) {
			int radomInt = new Random().nextInt(61); 
			noncestr=noncestr+str[radomInt];
		}
		return noncestr;
	}
}
