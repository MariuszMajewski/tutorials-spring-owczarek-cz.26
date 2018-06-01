package pl.mrmario.tutorials.spring.owczarek.cz26.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mrmario.tutorials.spring.owczarek.cz26.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz26.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz26.domain.User;

@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired(required= false)
	private Logger logger;

	public User createUser(String name) {
		if(logger!=null) {
			logger.log("Tworzenie u¿ytkownika " + name);
			
		}
		return new User(name);
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
