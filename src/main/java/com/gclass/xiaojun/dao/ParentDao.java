package com.gclass.xiaojun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gclass.xiaojun.domain.Parent;

@Mapper
public interface ParentDao {

	public List<Parent> findParents(@Param("start")Integer start,@Param("limit")Integer limit,@Param("query")String query);
	
	public Integer countParents(@Param("query")String query);
	
}
