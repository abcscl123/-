package com.ldz.action.cosmeticaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.service.cosmeticservice.CosmeticImageService;

@Controller
public class CosmeticImageAction extends BaseAction{
	public CosmeticImageService getService() {
		return (CosmeticImageService)service;
	}
	@Autowired
	public void setService(CosmeticImageService service) {
		this.service = service;
	}
	
}
