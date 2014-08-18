package controllers;

import play.*;
import play.mvc.*;
import services.NewsCateService;

import java.util.*;

import models.News_cate;

public class Application extends Controller {

    public static void index() {
    	List<News_cate> allNewsCate=NewsCateService.instance.fetchAllNewsCate();
       renderJSON(allNewsCate);
    }

}