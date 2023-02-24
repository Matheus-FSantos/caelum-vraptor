package io.github.MatheusFSantos.Infra;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateSessionFactory {
	public SessionFactory getSession() {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		return configuration.buildSessionFactory();
	}
}