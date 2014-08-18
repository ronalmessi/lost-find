package services;

import java.util.List;

import models.News_cate;
import models.News_data;

public class NewsDataService extends BaseService {
	public static NewsDataService instance = new NewsDataService();

	public List<News_data> findNewsDataByNewsCate(News_cate newscate) {

		List<News_data> newsData = News_data.find(
				this.getLogicDelSecuritySql("newscate=?"), newscate).fetch();
		return newsData;

	}

}
