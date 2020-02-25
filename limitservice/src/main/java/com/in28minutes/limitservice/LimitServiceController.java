package com.in28minutes.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {

	@Autowired
private	Configuration cg;
	@GetMapping("/limits")
	public ConfigurationLimitService retriveconfiguration() {
		
		return new ConfigurationLimitService(cg.getMinimum(),cg.getMaximum());
	}

}
