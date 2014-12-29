package com.xieyanhao.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.xieyanhao.model.pojos.User;
import com.xieyanhao.server.UserService;

/**
 * @ClassName: LoginAction.java
 * @Description: TODO(用一句话描述该文件做什么)
 * 
 * @author xieyanhao
 * @Date 2014年12月22日 下午1:51:52
 */
public class LoginAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1382463806235589294L;

	private UserService userService;
	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String login(){
		
		System.out.println("#########################");
		return "login";
	}
	public String getLogin() throws IOException{
		
		User result = userService.getUser(user);
		if (result == null) {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().print("<script>alert('用户不存在！');history.go(-1);</script>");
			return null;
		}
		return "success";
	}
}













