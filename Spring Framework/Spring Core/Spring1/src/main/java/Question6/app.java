package Question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
	static MessageSource messageSource;
    public static void main( String[] args ){
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("spring1_Q6.xml");
        project p = (project)context.getBean("project");
        p.projectInfo();
        
        messageSource = (MessageSource)context.getBean("messageSource");
        String msg = messageSource.getMessage("message", null, "Hello",null);
        System.out.println(msg);
        
    }
}