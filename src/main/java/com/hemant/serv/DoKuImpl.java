package com.hemant.serv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoKuImpl {
	
	@RequestMapping(path="star", method = RequestMethod.GET)
	public String createBox(int num) {
		String result = "";
		for(int i = 0; i<num;i++) {
			for(int j = 0; j<=num; j++) {
				result=result+"#";
			}
			result=result+"<br>";
		}
		return result;
	}

}
