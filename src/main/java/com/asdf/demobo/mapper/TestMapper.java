package com.asdf.demobo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.asdf.demobo.vo.*;

@Mapper
public interface TestMapper {

	List<TestVO> selectTestList() throws Exception;
}
