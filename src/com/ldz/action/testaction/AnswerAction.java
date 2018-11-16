package com.ldz.action.testaction;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.model.test.Answer;
import com.ldz.service.testservice.TestAnswerService;

@Controller
public class AnswerAction extends BaseAction{
	public TestAnswerService getService() {
		return (TestAnswerService)service;
	}
	@Autowired
	public void setService(TestAnswerService service) {
		this.service = service;
	}
	
	public String getAnswer() throws Exception{
		request = ServletActionContext.getRequest();
		if(request.getParameter("id") == null){
			return "fail";
		}
		Long id = Long.parseLong(request.getParameter("id"));
		
		request.setAttribute("answer", service.getBean(id));
		
		return "success";
	}
	
}
