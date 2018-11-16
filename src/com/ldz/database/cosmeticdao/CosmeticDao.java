package com.ldz.database.cosmeticdao;

import java.util.List;

import com.ldz.database.base.BaseDao;
import com.ldz.model.cosmetic.Cosmetics;

public interface CosmeticDao extends BaseDao{
	/*
	 * ������ѯ �Ƿ��Ƽ�
	 */
	List<Cosmetics> getBeanListByRecommend(boolean is_recommend) throws Exception;
	/*
	 * ģ����ѯ ����
	 */
	List<Cosmetics> getBeanListLikeName(String name) throws Exception;
	/*
	 * ��ҳ��ѯ
	 */
	List<Cosmetics> getBeanListByPage(int lastPage) throws Exception;
}
