package com.ldz.action.testaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.service.testservice.ProblemService;

@Controller
public class ProblemAction extends BaseAction{
	public ProblemService getService() {
		return (ProblemService)service;
	}
	//@Autowired
	public void setService(ProblemService service) {
		this.service = service;
	}
	
}
