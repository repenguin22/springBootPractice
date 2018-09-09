package com.soma.springboot.db.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.soma.springboot.db.entity.TestEntitiy;
import com.soma.springboot.db.repositories.TestRepository;

@Controller
public class TestController {
	
	// リポジトリに関連づけを行う
	@Autowired
	TestRepository testRepository;

	@RequestMapping(value="/db/basic/test/")
	public ModelAndView send(@RequestParam Map<String, String> param, ModelAndView mav) {
		
		// DBデータを取得
		// findAllで全件取得する
		Iterable<TestEntitiy> resultList =  testRepository.findAll();
		// viewの名前を指定してやる
		mav.setViewName("db_basic");
		// 変数をセット
		mav.addObject("data", resultList);
		// ページを返却
		return mav;
	}
}
