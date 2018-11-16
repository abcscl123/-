package test;

import java.util.List;

import org.junit.Test;

import com.ldz.database.cosmeticdao.CosmeticDao;
import com.ldz.database.function.DatabaseFactory;
import com.ldz.model.cosmetic.Cosmetics;

public class CosmeticTest {
	CosmeticDao cosmeticDao = DatabaseFactory.getCosmeticDao();
	@Test
	public void getBeanListByRecommend() throws Exception{
		List<Cosmetics> beanListByRecommend = cosmeticDao.getBeanListByRecommend(true);
		System.out.println(beanListByRecommend.get(0).getDescribes());
	}
}
