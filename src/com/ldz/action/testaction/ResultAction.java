package com.ldz.action.testaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.service.testservice.ResultService;

@Controller
public class ResultAction extends BaseAction{
	public ResultService getService() {
		return (ResultService)service;
	}
	//@Autowired
	public void setService(ResultService service) {
		this.service = service;
	}
	
}
