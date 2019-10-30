package com.fshan.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	

	@Override
	public String getFortune() {
		
		
		return "Learning annotation today !!! Yeah!!!";
	}

}
