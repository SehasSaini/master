package com.in28minutes.limitservice;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("limitservice")
public class Configuration {

	int minimum;
	int maximum;
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
}
