// JAVA Lab Single Inheritance Program Date-16/12/22
/*define a class base with data members string name and int age and member methods are
getbasedata(),showbasedata().define subclass Child,with data members string branch,integer
semester and member methods are getchilddata(),showchinddata().initialise an object of 
child and access its all the methods to show the existence of inheritance
implement this program in java.*/
import java.util.*;
class base

{     int age;
     String name;
    void getbasedata()
        {
        Scanner sc=new Scanner(System.in);
       
        
        System.out.println("ENTER THE NAME:");
         name=sc.nextLine();
          System.out.println("ENTER THE AGE:");
         age=sc.nextInt();
         
         }
         void showbasedata()
         {
         System.out.println("YOUR NAME:"+name);    
         System.out.println("YOUR AGE:"+age);       
             
             
         }
};

public class Main extends base
{
     String branch;
        int sem;
    void getchildata()
        {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("ENTER THE BRANCH:");
         branch=sc.nextLine();
          System.out.println("ENTER THE SEMESTER:");
         sem=sc.nextInt();
         
         }
         void showchildata()
         {
         System.out.println("YOUR BRANCH:"+branch);    
         System.out.println("YOUR SEMESTER:"+sem);       
             
             
         }
	public static void main(String[] args) {
		Main ob =new Main();
		ob.getbasedata();
		ob.showbasedata();
		ob.getchildata();
		ob.showchildata();
	}
};
