package com.soma.springboot.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>RestControllerは文字列を返却するコントローラです</p>
 * <p>あのクラウドのAPIとかでよく見かけるやつですね</p>
 * @author SomaMatsuzuki
 *
 */
@RestController
public class HelloController {
	
	@RequestMapping("/rest/hello/{name}")
	public String index(@PathVariable String name) {
		return "Welocome " + name + " Hello SpringBoot";
	}
	
}

