package Q8_Q9_Q10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class app {
    public static void main( String[] args ){
    	
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring1_Q8_Q9_Q10.xml");
    	
    	context.registerShutdownHook();
    	s1 stu = (s1) context.getBean("s1");
    	System.out.println(stu);
    	s2.myInit();
    	s2 stu2 = (s2)context.getBean("s2");
    	System.out.println(stu2);
    	s2.myDestroy();
    	s3.postCont();
    	s3 stu3= (s3)context.getBean("s3");
    	System.out.println(stu3);
    	s3.preDest();
    	
    }
}