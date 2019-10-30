package com.fshan.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
		//ceeate an array of strings
		private String[] data = {
				"Today is Monday",
				"Tomorrow is Tuesday",
				"The day after tomorrow is Wednesday"
		};
		
		//create a random number generator
		private Random myRandom = new Random();
		
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
