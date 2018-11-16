package com.ldz.service.cosmeticservice;

import java.util.List;

import com.ldz.model.cosmetic.Image;
import com.ldz.service.base.BaseService;

public interface CosmeticImageService extends BaseService{
	/*
	 * 按化妆品外键查询
	 */
	List<Image> getBeanListByCosmeticId(Image image) throws Exception;
}
