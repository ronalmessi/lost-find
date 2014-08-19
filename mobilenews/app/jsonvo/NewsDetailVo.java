package jsonvo;

import java.util.Date;

import models.News_data;

public class NewsDetailVo {
	
public int news_id;
	
	public String news_title;
	public String news_content;
	public String news_source;
	
	public Date news_adddate;
	public String news_catename;
	
	
	public NewsDetailVo() {
		super();
	}

	
	public NewsDetailVo(News_data newsData) {
		this.news_id=newsData.news_id;
		this.news_title=newsData.news_title;
		this.news_content=newsData.news_content;
		this.news_source=newsData.news_source;
		this.news_adddate=newsData.news_adddate;
		this.news_catename=newsData.newscate.news_catename;
		
	}


}
