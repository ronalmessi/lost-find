package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class News_cate extends Model {

	public int news_cateid;
	
	public String news_iconurl;
	
	
	public String news_catename;
	
	public String news_catedesc;
	
	
}
