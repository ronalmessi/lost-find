package services;

import java.util.List;

import models.Imgnews_data;
import models.News_data;

public class ImgnewsDataService extends BaseService {

	public static ImgnewsDataService instance = new ImgnewsDataService();

	public Imgnews_data findImgnewsDataByNewsData(News_data newsdata) {
		Imgnews_data imgnewsData = Imgnews_data.find(
				this.getLogicDelSecuritySql("news=?"), newsdata).first();
		return imgnewsData;
	}
}
