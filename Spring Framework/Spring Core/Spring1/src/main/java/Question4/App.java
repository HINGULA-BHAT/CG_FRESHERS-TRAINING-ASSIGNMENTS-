package Question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1_Q4&Q5.xml");
		/*
		 * System.out.println("Mentor Details"); Mentor mentor =
		 * (Mentor)context.getBean("mentor"); System.out.println(mentor);
		 */
    	System.out.println("All Details from details class");
    	Details details = (Details)context.getBean("details");
    	System.out.println(details);

	}

}
