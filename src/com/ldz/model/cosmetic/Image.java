package com.ldz.model.cosmetic;

import com.ldz.model.Entity;

/*
 * 化妆品图片
 */
public class Image implements Entity{
	// 唯一标识
	private Long id;
	// 路径
	private String path;
	// 是否是物品图片
	private boolean is_cosmeticImage;

	// 化妆品
	private Cosmetics cosmetics;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isIs_cosmeticImage() {
		return is_cosmeticImage;
	}

	public void setIs_cosmeticImage(boolean is_cosmeticImage) {
		this.is_cosmeticImage = is_cosmeticImage;
	}

	public Cosmetics getCosmetics() {
		return cosmetics;
	}

	public void setCosmetics(Cosmetics cosmetics) {
		this.cosmetics = cosmetics;
	}

	public Image(Long id, String path, Cosmetics cosmetics) {
		super();
		this.id = id;
		this.path = path;
		this.cosmetics = cosmetics;
	}

	public Image() {
		super();
	}

}
