package com.ldz.service.cosmeticservice;

import java.util.List;

import com.ldz.model.cosmetic.Image;
import com.ldz.service.base.BaseService;

public interface CosmeticImageService extends BaseService{
	/*
	 * ����ױƷ�����ѯ
	 */
	List<Image> getBeanListByCosmeticId(Image image) throws Exception;
}
