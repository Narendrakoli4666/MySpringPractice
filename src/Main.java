import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		
		Mobile mobile = context.getBean("oneplus",Mobile.class);
		
		
		mobile.getAndroidVersion();
		
	}

}
