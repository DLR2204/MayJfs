package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("demo")
@Configuration
public class Test {

	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(Test.class);

		Employee emp = (Employee) factory.getBean("emp");
		
		Product pro = (Product) factory.getBean("pro");
		
		System.out.println(pro);

		System.out.println(emp);

	}

}
