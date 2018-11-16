package com.ldz.action.cosmeticaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.service.cosmeticservice.TypeService;

@Controller
public class TypeAction extends BaseAction{
	public TypeService getService() {
		return (TypeService)service;
	}
	@Autowired
	public void setService(TypeService service) {
		this.service = service;
	}
	
}
