package cn.zybwz.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author 周倚斌
 * @version 1.0
 * 2018-09-02 11:22
 */
public class MyEncodingInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String company=null;
		try {
		company=arg0.getParameter("Company");
		company=new String(company.getBytes("ISO-8859-1"), "utf-8");
		System.out.println(company);
		arg0.setAttribute("Company", company);
		}catch(Exception e) {
			
		}
		return true;
	}

}
