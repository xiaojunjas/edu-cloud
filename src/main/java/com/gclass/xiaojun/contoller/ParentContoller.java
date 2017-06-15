package com.gclass.xiaojun.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gclass.xiaojun.dao.ParentDao;
import com.gclass.xiaojun.domain.Parent;

@RestController
@RequestMapping("/v1")
public class ParentContoller {
	
	@Autowired
	public ParentDao parentDao;
	
	@RequestMapping(value="/parents", method=RequestMethod.GET)
	public List<Parent> findParents(Integer start,Integer limit,String query){
		return parentDao.findParents(start,limit,query);
	}
	
	@RequestMapping(value="/count/parents", method=RequestMethod.GET)
	public Integer countParents(String query){
		return parentDao.countParents(query);
//		System.out.println();
	}
	
}
