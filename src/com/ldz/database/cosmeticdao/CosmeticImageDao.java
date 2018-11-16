package com.ldz.database.cosmeticdao;

import java.util.List;

import com.ldz.database.base.BaseDao;
import com.ldz.model.cosmetic.Image;

public interface CosmeticImageDao extends BaseDao{
	/*
	 * 按化妆品外键查询
	 */
	List<Image> getBeanListByCosmeticId(Image image) throws Exception;
}
