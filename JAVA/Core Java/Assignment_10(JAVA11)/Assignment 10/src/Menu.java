import java.io.*;
import java.util.*;

class item
{
 
 String name,id;
 int qty;
 double price,total;
  
 item(String i,String n,String q,String p)
 {

  name=n;
  id=i;
  qty=Integer.parseInt(q);
  price=Double.parseDouble(p);
  total=qty*price;
  
 }

 public String toString()
 {

  String s=name+" "+id+" "+qty+" "+price+" "+total;
  return(s);
 
 }
 
 public static void search(item[] arr,int n)throws IOException
 {
 
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String s=br.readLine();
 
  for(int i=0;i<n;i++)
  {
 
    if(arr[i].name.equals(s))
    {
 
    System.out.println(arr[i].toString());
    return;
    
   }
 
  }
 
  System.out.println("No Records Found"); 
 
 }

 public static void searchc(item[] arr,int n)
 {

  double max=0;int c=0;
     
        for(int i=0;i<n;i++)
        {
     
         if(arr[i].price > max)
         {
     
          c=i;
     
         }
 
  }
  System.out.println(arr[c].toString());
 
 }

}
 
class MenuDriven
{

 public static void main(String[] args)throws IOException
 {
 
  String s,space=" ";
        int c,i;
 
  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
 
  System.out.println("Enter Number of Product Records:");
 
  int n=Integer.parseInt(b.readLine());
 
  System.out.println("1: Insert Product Records:\n<id> <name> <price> <qty> :");

  FileWriter f=new FileWriter("item.dat");

  for(i=0;i<n;i++)
  {
  
   s=b.readLine()+"\n";
   f.write(s); 
 
  }
  
  f.close();

  item it[]=new item[20];
  FileReader fr=new FileReader("item.dat");
  BufferedReader br=new BufferedReader(fr);
 
  for(i=0;i<n;i++)
  {
 
   s=br.readLine();
   StringTokenizer t=new StringTokenizer(s,space);
            String si=new String(t.nextToken());
            String sn=new String(t.nextToken());
            String sq=new String(t.nextToken());
            String sp=new String(t.nextToken());
   it[i]=new item(si,sn,sq,sp);

  }
 
  do
  {
 
   System.out.println("Menu :\n"+"2:View Purchase Total \n3:Exit\n"+"Choice :" );
 
    c=Integer.parseInt(b.readLine());
 
   switch (c)
   {
 
    case 2:
      for(i=0;i<n;i++)
          System.out.println(it[i].toString()); 
         break;
 
    case 3:
    	System.out.println("Exit Program...");
      break;
     
          default:
            System.out.println("Invalid Option");
   }
  }while(c!=3);
 }
}
