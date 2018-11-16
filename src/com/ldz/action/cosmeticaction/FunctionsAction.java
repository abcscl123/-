package com.ldz.action.cosmeticaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.service.cosmeticservice.FunctionsService;

@Controller
public class FunctionsAction extends BaseAction{
	public FunctionsService getService() {
		return (FunctionsService)service;
	}
	@Autowired
	public void setService(FunctionsService service) {
		this.service = service;
	}
	
}
