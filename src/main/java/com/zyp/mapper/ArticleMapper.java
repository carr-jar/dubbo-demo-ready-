package com.zyp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zyp.bean.Article;
import com.zyp.bean.Condition;

public interface ArticleMapper {

	List<Article> list(@Param("con")Condition con, @Param("sortt")int sortt);

}
