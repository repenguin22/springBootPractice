package com.soma.springboot.form;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * フォームを使ってみよう
 * @author SomaMatsuzuki
 *
 */
@Controller
public class FormController {
	
	// GETで初期状態表示のもの
	@RequestMapping(value="/basic/form/basic", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		// viewの名前を指定してやる
		mav.setViewName("formBasic");
		// 変数をセット
		mav.addObject("msg", "いらっしゃい");
		// ページを返却
		return mav;
	}
	
	// POSTでフォームの値が送信された場合
	@ResponseBody
	@RequestMapping(value="/basic/form/basic", method=RequestMethod.POST)
	public ModelAndView send(@RequestParam Map<String, String> param, ModelAndView mav) {
		// viewの名前を指定してやる
		mav.setViewName("formBasic");
		// 変数をセット
		mav.addObject("msg", "いらっしゃい" + (String)param.get("name"));
		// ページを返却
		return mav;
	}

	
}

