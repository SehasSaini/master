package com.in28minutes.currencyconvertorservice;

import java.math.BigDecimal;


public class CurrencyConvertorBean {

	private long id;

	private String from;

	private String to;
	private BigDecimal conversionMultiple;
	int port;
	BigDecimal totalValue;
	public CurrencyConvertorBean()
	{
		
	}
	public CurrencyConvertorBean(long id, String from, String to, BigDecimal conversionMultiple, int port,
			BigDecimal totalValue) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.port = port;
		this.totalValue = totalValue;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public BigDecimal getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}
	
}
