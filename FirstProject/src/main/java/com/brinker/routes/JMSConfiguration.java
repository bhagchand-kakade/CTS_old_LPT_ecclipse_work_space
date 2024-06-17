//package com.brinker.routes;
//
//import javax.enterprise.context.Dependent;
//import javax.inject.Named;
//import javax.jms.JMSException;
//
//import org.apache.camel.component.jms.JmsComponent;
//import org.apache.camel.component.sjms2.Sjms2Component;
//import org.apache.activemq.artemis.jms.client.ActiveMQJMSConnectionFactory;
//import org.apache.activemq.jms.pool.PooledConnectionFactory;
//import org.eclipse.microprofile.config.inject.ConfigProperty;
//
//@Dependent
//public class JMSConfiguration {
//
//	@ConfigProperty(name = "jms.internal.url")
//	public String brokerURL;
//
//	@ConfigProperty(name = "jms.internal.username")
//	public String userName;
//
//	@ConfigProperty(name = "jms.internal.password")
//	public String password;
//
//	@Named("jmsInternal")
//	public JmsComponent sjms2Service() throws JMSException {
//
//		// Sjms2Component sjms2Service = new Sjms2Component();
//		JmsComponent jmsComponent = new JmsComponent();
//
//		jmsComponent.setConnectionFactory(amqJmsServiceFactory());
//		return jmsComponent;
//	}
//
//	public PooledConnectionFactory amqJmsServiceFactory() throws JMSException {
//		String brokerUri = new String(brokerURL + "?sslEnabled=false&verifyHost=false");
//		ActiveMQJMSConnectionFactory amqJmsServiceFactory = new ActiveMQJMSConnectionFactory(brokerUri, userName,
//				password);
////		amqJmsServiceFactory.setBrokerURL(brokerURL);
////		amqJmsServiceFactory.setUser(userName);
////		amqJmsServiceFactory.setPassword(password);
//		PooledConnectionFactory pooledConnectionFactory = new PooledConnectionFactory();
//		pooledConnectionFactory.setConnectionFactory(amqJmsServiceFactory);
//		return pooledConnectionFactory;
//	}
//
//}