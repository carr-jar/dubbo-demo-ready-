package com.zyp.service;

import java.util.List;

import com.zyp.bean.Article;
import com.zyp.bean.Condition;

public interface ArticleService {

	List<Article> list(Condition con, int sortt);

}
