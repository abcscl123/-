package com.ldz.action.testaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.service.testservice.NumberService;

@Controller
public class NumberAction extends BaseAction{
	public NumberService getService() {
		return (NumberService)service;
	}
	@Autowired
	public void setService(NumberService service) {
		this.service = service;
	}
	
}
