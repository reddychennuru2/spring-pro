package com.luv2code.springdemo;
import java.util.concurrent.ThreadLocalRandom;
public class RandomFortuneService  implements FortuneService{
	public String getFortune()
	{
		String fortunes[]= {"lottery winning","gold coins ","silver medal"};
		int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
		return fortunes[randomNum];
	}

}
