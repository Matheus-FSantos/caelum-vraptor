package br.com.vraptor.Infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import br.com.caelum.vraptor.ioc.RequestScoped;

@Component
@RequestScoped
public class CreateSession implements ComponentFactory<Session>{
	private final SessionFactory sessionFactory;
	private Session session;
	
	
	public CreateSession(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@PostConstruct
	public void open() {
		this.session = this.sessionFactory.openSession();
	}
	
	public Session getInstance() {
		return this.session;
	}
	
	@PreDestroy
	public void close() {
		this.session.close();
	}
}