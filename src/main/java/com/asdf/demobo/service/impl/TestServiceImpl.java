package com.asdf.demobo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asdf.demobo.mapper.*;
import com.asdf.demobo.service.*;
import com.asdf.demobo.vo.*;

@Service
public class TestServiceImpl implements TestService {
	
	@Resource
	private TestMapper testDao;
	
	@Override
	public List<TestVO> getTestList() throws Exception{
		return testDao.selectTestList();
	}
	

}
