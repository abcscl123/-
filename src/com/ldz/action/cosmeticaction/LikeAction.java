package com.ldz.action.cosmeticaction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.model.cosmetic.Cosmetics;
import com.ldz.model.cosmetic.Like;
import com.ldz.model.user.User;
import com.ldz.service.cosmeticservice.LikeService;

@Controller
public class LikeAction extends BaseAction {
	public LikeService getService() {
		return (LikeService) service;
	}

	@Autowired
	public void setService(LikeService service) {
		this.service = service;
	}

	public String like() throws Exception {
		System.out.println("like");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		User user = (User)request.getSession().getAttribute("user");
		
		if(user == null){
			return LOGINUI;
		}
		
		List<Like> likeList = getService().getBeanByUserAndCosmetics(user.getId(), Long.parseLong(request.getParameter("id")));
		
		if(likeList.size() != 0){
			Like like = likeList.get(0);
			like.setIs_like(false);
			getService().update(like);
		}
		
		return COSMETICUI;
	}

	public String notLike() throws Exception {
		System.out.println("notlike");
		HttpServletRequest request = ServletActionContext.getRequest();
		
		User user = (User)request.getSession().getAttribute("user");
		
		if(user == null){
			return LOGINUI;
		} 
		
		List<Like> likeList = getService().getBeanByUserAndCosmetics(user.getId(), Long.parseLong(request.getParameter("id")));
		
		if(likeList.size() != 0){
			Like like = likeList.get(0);
			like.setIs_like(true);
			getService().update(like);
		} else {
			Like like = new Like();
			like.setIs_like(true);
			like.setUser(user);
			Cosmetics cosmetics = new Cosmetics();
			cosmetics.setId(Long.parseLong(request.getParameter("id")));
			like.setCosmetics(cosmetics);
			getService().save(like);
		}
		
		return COSMETICUI;
	}
}
