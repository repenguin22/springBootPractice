package com.soma.springboot.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * JSONVer
 * </p>
 * 
 * @author SomaMatsuzuki
 *
 */
@RestController
public class RestControllerJSON {
	
	@RequestMapping("/rest/json/{name}")
	public JsonDataClass index(@PathVariable String name) {
		return new JsonDataClass(name,24);
	}
	
}

class JsonDataClass {
	private String name;
	private int age;
	
	public JsonDataClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
