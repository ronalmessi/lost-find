package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import play.db.jpa.Model;

@Entity
public class News_data extends Model{

	public int news_id;
	
	public String news_title;
	public String news_content;
	public String news_source;
	
	public Date news_adddate;
	@ManyToOne
	public News_cate newscate;
}
