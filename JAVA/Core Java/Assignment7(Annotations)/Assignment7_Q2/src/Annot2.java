import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
	int AuthorID();
	String Author();
	String Supervisor();
	String date();
	String time();
	String Description();
}

@info(AuthorID=1,Author="Hingula",Supervisor="XYZ",date="11/08/2021",time="23.30 PM", Description="Annotation for class")
class Testannotation{
	String Author;
	String  date;
	String time;
	public Testannotation(String author, String date, String time) {
		super();
		Author = author;
		this.date = date;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Testannotation [Author=" + Author + ", date=" + date + ", time=" + time + "]";
	}
	
}
public class Annot2 {

	public static void main(String[] args) {
		Testannotation A=new Testannotation("Hingula","11/08/2021","23.34");
		Class c=A.getClass();
		Annotation an=c.getAnnotation(info.class);
		info i=(info)an;
		System.out.println(i.Author()+"\t"+i.AuthorID()+"\t"+i.date()+"\t"+i.time()+"\t"+i.Description());

	}

}