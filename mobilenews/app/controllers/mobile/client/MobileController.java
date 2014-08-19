package controllers.mobile.client;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import jsonvo.NewsDetailVo;
import jsonvo.NewsVo;
import jsonvo.Result;
import models.Imgnews_data;
import models.News_cate;
import models.News_data;
import services.ImgnewsDataService;
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

	public static void cate_img(int cateId) {
		List<NewsVo> imgNewsList = new ArrayList<NewsVo>();

		News_cate newscate = NewsCateService.instance
				.findNewsCateByCateId(cateId);

		List<News_data> newsdataList = NewsDataService.instance
				.findNewsDataByNewsCate(newscate);
		for (News_data newsData : newsdataList) {
			Imgnews_data imgNewsData = ImgnewsDataService.instance
					.findImgnewsDataByNewsData(newsData);
			if (imgNewsData != null) {
				imgNewsList.add(new NewsVo(imgNewsData));
			}

		}

		if (imgNewsList.size() == 0) {
			renderJSON(new Result(false, "该分类下没有图片新闻"));
		} else {
			renderJSON(defaultGson.toJson(new Result(imgNewsList)));
		}

	}

	public static void cate_lst(int cateId) {
		List<NewsVo> newsList = new ArrayList<NewsVo>();

		News_cate newscate = NewsCateService.instance
				.findNewsCateByCateId(cateId);

		List<News_data> newsdataList = NewsDataService.instance
				.findNewsDataByNewsCate(newscate);
		for (News_data newsData : newsdataList) {

			if (newsData != null) {
				newsList.add(new NewsVo(newsData));
			}

		}

		if (newsList.size() == 0) {
			renderJSON(new Result(false, "该分类下没有新闻"));
		} else {
			renderJSON(defaultGson.toJson(new Result(newsList)));
		}

	}

	public static void detail(int newsId) {
		List<NewsDetailVo> newsDetailList = new ArrayList<NewsDetailVo>();

		List<News_data> newsdataList = NewsDataService.instance
				.findNewsDataByNewsId(newsId);
		for (News_data newsData : newsdataList) {

			if (newsData != null) {
				newsDetailList.add(new NewsDetailVo(newsData));
			}

		}

		if (newsDetailList.size() == 0) {
			renderJSON(new Result(false, "该分类下没有新闻"));
		} else {
			renderJSON(defaultGson.toJson(new Result(newsDetailList)));
		}

	}

}
