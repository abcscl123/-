package com.ldz.action.useraction;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.model.user.User;
import com.ldz.service.userservice.UserService;

@Controller
public class UserAction extends BaseAction{
	User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public UserService getService() {
		return (UserService)service;
	}
	@Autowired
	public void setService(UserService service) {
		this.service = service;
	}
	
	//用于跳转到login界面
	public String loginUI(){
		System.out.println("loginUI");
		return LOGINUI;
	}
	
	//用于跳转到register界面
	public String registrUI(){
		System.out.println("registrUI");
		return REGISTERUI;
	}
	
	public String indexUI(){
		System.out.println("indexUI");
		return INDEXUI;
	}
	
	public String searchUI(){
		System.out.println("searchUI");
		return SEARCHUI;
	}
	
	public String userUI(){
		System.out.println("userUI");
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(session.getAttribute("user") != null){
			return USERUI;
		} else {
			return LOGINUI;
		}
 	}
	
	public String changeUI(){
		System.out.println("changeUI");
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(session.getAttribute("user") != null){
			return CHANGEUI;
		} else {
			return LOGINUI;
		}
	}
	
	public String login() throws Exception{
		System.out.println("login");
		if(user.getName() != null && user.getPassword() != null){
			User temp = getService().getBeanByNameAndPassword(user);
			System.out.println(temp);
			if(temp != null){
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.setAttribute("user", temp);
				session.setAttribute("date", new Date());
				return INDEX;
			} else {
				return LOGINUI;
			}
		}
		return LOGIN;
	}
		
	public String register() throws Exception{
		if(user.getName() != null && user.getPassword() != null){
			getService().save(user);
		}
		return REGISTER;
	}
	
	public String change() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		if(request.getParameter("user.sex").equals("男")){
			user.setSex(true);
		} else {
			user.setSex(false);
		}
		getService().update(user);
		session.setAttribute("user", user);
		return CHANGE;
	}
	
	public String saveImage() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		if(request.getParameter("user.sex").equals("男")){
			user.setSex(true);
		} else {
			user.setSex(false);
		}
		getService().update(user);
		session.setAttribute("user", user);
		return CHANGE;
	}
}
