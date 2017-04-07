package poc.raviraj.cxfwspoc.app;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import poc.raviraj.cxfwspoc.ClientBeanConfiguration;
import poc.raviraj.cxfwspoc.service.HelloWorld;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ClientBeanConfiguration.class);
		//HelloWorld helloWorld = (HelloWorld) ctx.getBean("client");
		HelloWorld hellWorld = ((JaxWsProxyFactoryBean) ctx.getBean("factory")).create(HelloWorld.class);
		System.out.println(hellWorld.sayHi("Raviraj"));
	}

}
