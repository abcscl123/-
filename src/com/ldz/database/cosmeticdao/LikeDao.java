package com.ldz.database.cosmeticdao;

import java.util.List;

import com.ldz.database.base.BaseDao;
import com.ldz.model.cosmetic.Like;

public interface LikeDao extends BaseDao{
	/*
	 * ���û�id�ͻ�ױƷid��ѯ
	 */
	List<Like> getBeanByUserAndCosmetics(Long user_id, Long Cosmetic_id) throws Exception;
}
