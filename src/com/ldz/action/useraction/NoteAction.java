package com.ldz.action.useraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.service.userservice.NoteService;

@Controller
public class NoteAction extends BaseAction{
	public NoteService getService() {
		return (NoteService)service;
	}
	@Autowired
	public void setService(NoteService service) {
		this.service = service;
	}
	
}
