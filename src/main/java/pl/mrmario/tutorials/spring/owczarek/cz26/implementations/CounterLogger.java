package pl.mrmario.tutorials.spring.owczarek.cz26.implementations;

import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz26.api.Logger;

@Service("logger")
public class CounterLogger implements Logger{
	private int count = 0;
	
	public void log(String message) {
		System.out.println(count++ + " : " +message);
		
	}

}
