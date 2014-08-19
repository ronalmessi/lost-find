package jsonvo;

import java.util.Date;

import models.Imgnews_data;
import models.News_cate;
import models.News_data;

public class NewsVo {

	public int news_id;

	public String imgnews_imgurl;

	public int news_cateid;
	public String news_catename;

	public String news_title;
	

	public NewsVo() {
		super();
	}

	public NewsVo(Imgnews_data imgNewsData) {
		this.news_id = imgNewsData.news.news_id;
		this.imgnews_imgurl = imgNewsData.imgnews_imgurl;
		this.news_title = imgNewsData.news.news_title;
		this.news_cateid = imgNewsData.news.newscate.news_cateid;
		this.news_catename = imgNewsData.news.newscate.news_catename;
	}

	public NewsVo(News_data newsData) {
		this.news_id = newsData.news_id;
		this.news_title = newsData.news_title;
		this.news_cateid = newsData.newscate.news_cateid;
		this.news_catename = newsData.newscate.news_catename;
	}
	
	

}
