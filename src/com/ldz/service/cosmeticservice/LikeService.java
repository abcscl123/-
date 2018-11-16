package com.ldz.service.cosmeticservice;

import java.util.List;

import com.ldz.model.cosmetic.Like;
import com.ldz.service.base.BaseService;

public interface LikeService extends BaseService{
	/*
	 * 按用户id和化妆品id查询
	 */
	List<Like> getBeanByUserAndCosmetics(Long user_id, Long Cosmetic_id) throws Exception;
}
