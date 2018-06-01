package pl.mrmario.tutorials.spring.owczarek.cz26.domain;

public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

	public User(String name) {
		super();
		this.name = name;
	}
	
}
