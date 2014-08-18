package services;

import java.util.List;

import models.News_cate;

public final class NewsCateService extends BaseService {

	public static NewsCateService instance = new NewsCateService();

	public List<News_cate> fetchAllNewsCate() {

		List<News_cate> allNewsCate = News_cate.findAll();
		return allNewsCate;

	}

	public News_cate findNewsCateByCateId(int cateId) {

		News_cate news_cate = News_cate.find(
				this.getLogicDelSecuritySql("news_cateid=?"), cateId).first();
		return news_cate;

	}

}
