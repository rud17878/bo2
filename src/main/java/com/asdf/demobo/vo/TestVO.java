package com.asdf.demobo.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("testVO")
public class TestVO {

	private String title;
}
