package com.ldz.action.commentaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.service.commentservice.ReplyService;

@Controller
public class ReplyAction extends BaseAction{
	public ReplyService getService() {
		return (ReplyService)service;
	}
	@Autowired
	public void setService(ReplyService service) {
		this.service = service;
	}
	
}
