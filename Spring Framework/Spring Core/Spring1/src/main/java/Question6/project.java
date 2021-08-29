package Question6;
import java.beans.Statement;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbConfig.properties")
public class project {
	private static final Question6.student Statement = null;
	private String projectName;
	private student student;
	
	@Autowired
	Environment env;
	public project() {
		
	}
	public project(String projectName, student student) {
		super();
		this.projectName = projectName;
		this.student = student;

	}
	
	public String getProjectName() {
		return projectName;
	}
	@Value("website for college")
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public student getStudent() {
		return student;
	}
	@Resource
	public void setStudent(student student) {
		this.student = student;
	}
	public void projectInfo() {
		System.out.println("Project Information:\nProject Name: "+ getProjectName()+"\nStudent : "
				+getStudent().getName()+","+getStudent().getRegNo());
	}
	public String toString() {
		return env.getProperty("user.Name")+" Project [projectName=" + projectName + ", \nstudent=" + student + "]";
    }
	
	

}
	
	/*public String getProjectName() {
		return projectName;
	}
	@Value("website for college")
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public student getStudent() {
		return Statement;
	}
	@Resource
	public void setStudent(student student) {
		this.student = student;
	}
	public void projectInfo() {
		System.out.println("Project Information:\nProject Name: "+ getProjectName()+"\nStudent : "
				+getStudent().getName()+","+getStudent().getRegNo());
	}
	public String toString() {
		return env.getProperty("user.Name")+" Project [projectName=" + projectName + ", \nstudent=" + student + "]";
    }*/
	
	


