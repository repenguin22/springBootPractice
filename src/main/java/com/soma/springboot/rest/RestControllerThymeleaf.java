package com.soma.springboot.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * テンプレートを返してみましょう
 * @author SomaMatsuzuki
 *
 */
@RestController
public class RestControllerThymeleaf {
	
	@RequestMapping("/rest/template/basic/")
	public ModelAndView index(ModelAndView mav) {
		// viewの名前を指定してやる
		mav.setViewName("index");
		// 変数をセット
		mav.addObject("msg", "いらっしゃい");
		// ページを返却
		return mav;
	}
	
}

