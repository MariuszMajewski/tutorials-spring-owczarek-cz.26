package pl.mrmario.tutorials.spring.owczarek.cz26.implementations;

import java.util.Date;
import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz26.api.Logger;

//@Service
public class WithDateLogger implements Logger {
	public void log(String message) {
		System.out.println(new Date() + " : " + message);
	}
}
