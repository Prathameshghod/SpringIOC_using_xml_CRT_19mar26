package RCOEM.demo.domain;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Employee e1=(Employee)context.getBean("Prathamesh");
		System.out.println(e1);
		context.close();
	}

}
