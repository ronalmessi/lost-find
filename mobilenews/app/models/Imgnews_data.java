package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Imgnews_data extends Model{

	public int imgnews_id;
	
	public String imgnews_imgurl;
	
	@ManyToOne
	public News_data newsdata;
}
