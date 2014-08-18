package controllers.mobile.client;

import java.text.SimpleDateFormat;
import java.util.List;

import jsonvo.Result;
import models.News_cate;
import models.News_data;
import services.NewsCateService;
import services.NewsDataService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cn.bran.play.JapidController;

public class MobileController extends JapidController {

	private static final String DEFAULT_DATE_FORMAT = "yyyy.MM.dd HH:mm:ss.SSS";

	private static final Gson defaultGson = new GsonBuilder().setDateFormat(
			DEFAULT_DATE_FORMAT).create();
	private static final SimpleDateFormat defaultDateFormatter = new SimpleDateFormat(
			DEFAULT_DATE_FORMAT);

	public static void index() {
		List<News_cate> allNewsCate = NewsCateService.instance
				.fetchAllNewsCate();
		if (allNewsCate.size() == 0) {
			renderJSON(new Result(false, "没有新闻分类"));
		} else {
			renderJSON(defaultGson.toJson(new Result(allNewsCate)));
		}
		renderJSON(allNewsCate);
	}

	public static void cate_img(int cateid) {
		News_cate newscate = NewsCateService.instance
				.findNewsCateByCateId(cateid);
		List<News_data> newsdataList = NewsDataService.instance
				.findNewsDataByNewsCate(newscate);

	}

}
