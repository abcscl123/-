package com.ldz.service.cosmeticservice;

import java.util.List;

import com.ldz.model.cosmetic.Like;
import com.ldz.service.base.BaseService;

public interface LikeService extends BaseService{
	/*
	 * ���û�id�ͻ�ױƷid��ѯ
	 */
	List<Like> getBeanByUserAndCosmetics(Long user_id, Long Cosmetic_id) throws Exception;
}
