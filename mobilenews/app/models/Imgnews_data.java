package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import play.db.jpa.Model;

@Entity
public class Imgnews_data extends BaseModel{

	public int imgnews_id;
	
	public String imgnews_imgurl;
	
	@OneToOne
	public News_data news;
}
