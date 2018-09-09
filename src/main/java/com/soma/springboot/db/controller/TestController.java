package com.soma.springboot.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.soma.springboot.db.entity.TestEntitiy;
import com.soma.springboot.db.repositories.TestRepository;

@Controller
public class TestController {
	
	// リポジトリに関連づけを行う
	@Autowired
	TestRepository testRepository;
	
	@RequestMapping(value="/db/basic/test/", method=RequestMethod.GET)
	public ModelAndView send(@ModelAttribute("formModel") TestEntitiy testEntitiy, ModelAndView mav) {
		
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
	
	@RequestMapping(value="/db/basic/test/", method=RequestMethod.POST)
	@Transactional(readOnly=false)
	public ModelAndView insert(@ModelAttribute("formModel") TestEntitiy testEntitiy, ModelAndView mav) {
		// 引数にhtmlのformにセットした"formModel"を持ってきている
		// insert
		testRepository.saveAndFlush(testEntitiy);
		return new ModelAndView("redirect:/db/basic/test/");
	}
}
