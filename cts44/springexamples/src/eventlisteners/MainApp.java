package eventlisteners;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
	context.start();
	HelloWorld obj=(HelloWorld) context.getBean("helloWorld");
	obj.getMessage();
	context.refresh();
	context.stop();
	}

}
