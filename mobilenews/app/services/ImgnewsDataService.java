package services;

import java.util.List;

import models.Imgnews_data;
import models.News_data;

public class ImgnewsDataService extends BaseService {

	public static ImgnewsDataService instance = new ImgnewsDataService();

//	public List<Imgnews_data> findImgnewsDataByNewsData(News_data newsdata) {
//		List<Imgnews_data> imgnewsDataList = Imgnews_data.find(
//				this.getLogicDelSecuritySql("newsdata=?"), newsdata).first();
//		return imgnewsData;
//	}
}
