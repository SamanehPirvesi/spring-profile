import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.ProfileConfig;
import model.SpringTest;

public class MainProfileExample {
	public static void main(String[] args) {
		ApplicationContext contex=new AnnotationConfigApplicationContext(ProfileConfig.class);
		SpringTest springTest=(SpringTest) contex.getBean(SpringTest.class);
		springTest.printYourMessage();
		

	}

}
 