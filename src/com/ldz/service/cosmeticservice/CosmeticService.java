package com.ldz.service.cosmeticservice;

import java.util.List;

import com.ldz.model.cosmetic.Cosmetics;
import com.ldz.service.base.BaseService;

public interface CosmeticService extends BaseService{
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
