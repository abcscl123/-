package com.ldz.model.cosmetic;

import com.ldz.model.Entity;
import com.ldz.model.user.User;

public class Like implements Entity{
	private Long id;
	private boolean is_like;

	private Cosmetics cosmetics;
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isIs_like() {
		return is_like;
	}

	public void setIs_like(boolean is_like) {
		this.is_like = is_like;
	}

	public Cosmetics getCosmetics() {
		return cosmetics;
	}

	public void setCosmetics(Cosmetics cosmetics) {
		this.cosmetics = cosmetics;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
