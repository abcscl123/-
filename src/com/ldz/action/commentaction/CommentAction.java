package com.ldz.action.commentaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.service.commentservice.CommentService;

@Controller
public class CommentAction extends BaseAction{
	public CommentService getService() {
		return (CommentService)service;
	}
	@Autowired
	public void setService(CommentService service) {
		this.service = service;
	}
	
}
