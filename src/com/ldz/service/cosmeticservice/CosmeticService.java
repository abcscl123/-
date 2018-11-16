package com.ldz.service.cosmeticservice;

import java.util.List;

import com.ldz.model.cosmetic.Cosmetics;
import com.ldz.service.base.BaseService;

public interface CosmeticService extends BaseService{
	/*
	 * 条件查询 是否推荐
	 */
	List<Cosmetics> getBeanListByRecommend(boolean is_recommend) throws Exception;
	
	/*
	 * 模糊查询 名字
	 */
	List<Cosmetics> getBeanListLikeName(String name) throws Exception;
	
	/*
	 * 分页查询
	 */
	List<Cosmetics> getBeanListByPage(int lastPage) throws Exception;
}
