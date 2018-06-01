package pl.mrmario.tutorials.spring.owczarek.cz26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.mrmario.tutorials.spring.owczarek.cz26.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz26.domain.User;

/**
 * @author Artur Owczarek
 * 	MrMario108
 */
public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		UsersRepository userRep = context.getBean("usersRepository", UsersRepository.class);
		User janek = userRep.createUser("Janek");
		System.out.println("U¿ytkownik " + janek.getName() + " zosta³ utworzony");
	}
}