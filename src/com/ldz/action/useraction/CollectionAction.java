package com.ldz.action.useraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.service.userservice.CollectionService;

@Controller
public class CollectionAction extends BaseAction{
	public CollectionService getService() {
		return (CollectionService)service;
	}
	@Autowired
	public void setService(CollectionService service) {
		this.service = service;
	}
	
}
