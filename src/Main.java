import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		
		Oneplus mobile = context.getBean("oneplus", Oneplus.class);
		
		
		mobile.getAndroidVersion();

		
	}

}
