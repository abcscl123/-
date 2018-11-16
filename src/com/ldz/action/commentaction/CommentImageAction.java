package com.ldz.action.commentaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.service.commentservice.CommentImageService;

@Controller
public class CommentImageAction extends BaseAction{
	public CommentImageService getService() {
		return (CommentImageService)service;
	}
	@Autowired
	public void setService(CommentImageService service) {
		this.service = service;
	}
	
}
