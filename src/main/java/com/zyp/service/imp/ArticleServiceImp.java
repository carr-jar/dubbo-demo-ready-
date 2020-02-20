package com.zyp.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyp.bean.Article;
import com.zyp.bean.Condition;
import com.zyp.mapper.ArticleMapper;
import com.zyp.service.ArticleService;
@Service
public class ArticleServiceImp implements ArticleService{
	@Autowired
	ArticleMapper mapper;
	@Override
	public List<Article> list(Condition con,int sortt) {
		// TODO Auto-generated method stub
		return mapper.list(con,sortt);
	}

}
