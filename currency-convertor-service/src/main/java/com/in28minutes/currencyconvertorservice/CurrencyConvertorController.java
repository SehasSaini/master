package com.in28minutes.currencyconvertorservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class CurrencyConvertorController {
	
	@GetMapping("/currency-convertor/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConvertorBean convertor(@PathVariable String from ,@PathVariable String to,@PathVariable BigDecimal quantity)
	{ 
		Map<String,String> uriVariables=new HashMap<>();
		uriVariables.put("from", from);
	uriVariables.put("to",to);
		ResponseEntity<CurrencyConvertorBean> response=new RestTemplate().getForEntity("http://localhost:8000/curreny-exchange/from/{from}/to/{to}", CurrencyConvertorBean.class, uriVariables);
 CurrencyConvertorBean cResponse=	response.getBody();
 return new CurrencyConvertorBean(cResponse.getId(),cResponse.getFrom(),cResponse.getTo(),cResponse.getConversionMultiple(),cResponse.getPort(),quantity.multiply(cResponse.getConversionMultiple()));
 

	}
	
	
	
	  }


