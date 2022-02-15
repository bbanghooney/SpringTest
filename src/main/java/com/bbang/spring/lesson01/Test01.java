package com.bbang.spring.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping("/lesson01/test01")
public class Test01 {
	
	@RequestMapping("/1")
	@ResponseBody
	public String printString() {
		return "테스트 프로젝트 완성";
	}
	
}
