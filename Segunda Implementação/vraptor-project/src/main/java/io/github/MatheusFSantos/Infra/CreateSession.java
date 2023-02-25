package io.github.MatheusFSantos.Infra;

import org.hibernate.Session;

public class CreateSession {
	private CreateSessionFactory createSessionFactory;
	
	public CreateSession() {
		createSessionFactory = new CreateSessionFactory();
	}
	
	public Session getSession() {
		return createSessionFactory.getSession().openSession();
	}
}