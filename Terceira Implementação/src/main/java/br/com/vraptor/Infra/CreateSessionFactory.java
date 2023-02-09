package br.com.vraptor.Infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
@ApplicationScoped
public class CreateSessionFactory implements ComponentFactory<SessionFactory> {
	
	private SessionFactory sessionFactory;
	
	@PostConstruct
	public void open(){
		Configuration configuration = new Configuration();
		configuration.configure();
		
		sessionFactory = configuration.buildSessionFactory();
	}
	
	public SessionFactory getInstance() {
		return this.sessionFactory;
	}
	
	@PreDestroy
	public void close() {
		this.sessionFactory.close();
	}
}