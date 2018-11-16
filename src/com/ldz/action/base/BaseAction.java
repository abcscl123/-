package com.ldz.action.base;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.ldz.model.Entity;
import com.ldz.service.base.BaseService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class BaseAction extends ActionSupport{
	//不可以直接实例化
	protected HttpServletRequest request;
	protected BaseService service;
	
	public static final String LOGIN = "login";
	public static final String LOGINUI = "loginUI";
	public static final String INDEX = "index";
	public static final String REGISTER = "register";
	public static final String REGISTERUI = "registerUI";
	public static final String INDEXUI = "indexUI";
	public static final String SEARCHUI = "searchUI";
	public static final String USERUI = "userUI";
	public static final String CHANGEUI = "changeUI";
	public static final String CHANGE = "change";
	
	public static final String LIKE = "like";
	public static final String NOTLIKE = "notLike";
	

	public static final String COSMETICUI = "cosmeticUI";
	public static final String LIKECOSMETIC = "likeCosmetic";
	public static final String ARYICLEUI = "articleUI";
	
}
