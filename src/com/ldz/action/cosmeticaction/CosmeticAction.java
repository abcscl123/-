package com.ldz.action.cosmeticaction;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.model.Entity;
import com.ldz.model.QueryBuilder;
import com.ldz.model.cosmetic.Cosmetics;
import com.ldz.model.cosmetic.Image;
import com.ldz.service.cosmeticservice.CosmeticImageService;
import com.ldz.service.cosmeticservice.CosmeticService;
import com.ldz.service.function.ServiceFactory;

@Controller
public class CosmeticAction extends BaseAction {
	private boolean more = true;
	Cosmetics cosmetic;

	public Cosmetics getCosmetic() {
		return cosmetic;
	}

	public void setCosmetic(Cosmetics cosmetic) {
		this.cosmetic = cosmetic;
	}

	public CosmeticService getService() {
		return (CosmeticService) service;
	}

	@Autowired
	public void setService(CosmeticService service) {
		this.service = service;
	}

	public String cosmeticUI() throws Exception {
		List<Cosmetics> cosmeticsList = getService().getBeanListByRecommend(true);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("cosmeticsList", this.towList(cosmeticsList));
		request.setAttribute("more", more);
		return COSMETICUI;
	}

	public String getBeanListLikeName() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Cosmetics> cosmeticsList = getService().getBeanListLikeName(request.getParameter("name"));
		request.setAttribute("cosmeticsList", this.towList(cosmeticsList));
		request.setAttribute("more", more);
		return COSMETICUI;
	}
	
	public String moreCosmetic() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		int length = Integer.parseInt(request.getParameter("length"));
		
		List<Cosmetics> cosmeticsList = getService().getBeanListByPage(length+4);
		request.setAttribute("cosmeticsList", this.towList(cosmeticsList));
		request.setAttribute("length", length);
		if(cosmeticsList.size() < length+4){
			request.setAttribute("more", false);
		} else {
			request.setAttribute("more", true);
		}
		return COSMETICUI;
	}
	
	public String articleUI() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		Long id = Long.parseLong(request.getParameter("id"));
		Cosmetics cosmetics = (Cosmetics) getService().getBean(id);
		request.setAttribute("cosmetic", getService().getBean(id));
		System.out.println(cosmetics.getDescribes());
		return ARYICLEUI;
	}
	
	//将list拆分成每两个为一个list，重新封装
	public static List<List<Cosmetics>> towList(List<Cosmetics> list){
		List<List<Cosmetics>> cosmeticList = new ArrayList<List<Cosmetics>>();
		for(int i=0;i<list.size();){
			List<Cosmetics> temp = new ArrayList<Cosmetics>();
			for(int j=0;j<2;j++){
				if(i < list.size()){
					temp.add(list.get(i));
					i++;
				} else {
					break;
				}
			}
			cosmeticList.add(temp);
		}
		return cosmeticList;
	}
}
