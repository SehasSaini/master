package com.in28minutes.limitservice;

public class ConfigurationLimitService {

	int min;
	int max;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public ConfigurationLimitService(int min, int max) {
		super();
		this.min = min;
		this.max = max;
		
	}

}
