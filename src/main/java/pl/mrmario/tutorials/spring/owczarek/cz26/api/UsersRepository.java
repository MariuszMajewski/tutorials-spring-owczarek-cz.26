package pl.mrmario.tutorials.spring.owczarek.cz26.api;

import pl.mrmario.tutorials.spring.owczarek.cz26.domain.User;

public interface UsersRepository {
	User createUser(String name);
	void setLogger(Logger logger);
}
