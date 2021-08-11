import java.util.Scanner;

abstract class Per{
	
        abstract void persist();

		}
class FilePersistence extends Per{
	
		void persist() {
				
		System.out.println("File persisted");
			}
		}
class DatabasePersistence extends Per{
	
		void persist() {
			
		System.out.println("Database persisted");
		
			}
		}


public class Persistence {

public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Data is saved in ... (select either file or database):");
				String s=sc.nextLine();
				
				FilePersistence f=new FilePersistence();
				DatabasePersistence d=new DatabasePersistence();
				
				if(s.contentEquals("file")){
					f.persist();
				}
				else{
					d.persist();
				}
		        
			}

}