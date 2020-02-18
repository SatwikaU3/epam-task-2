import java.util.Scanner;
import java.io.PrintStream;
public class Cost {
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("select the material standard\n1.standard\n2.abouve standard\n3.high standard\n4.high standard and fully automated");
	   System.out.println("enter material standard");
	   String materialstandard=sc.next();
	   double area_of_house,total_cost_of_construction;
	   System.out.println("enter area of house");
	   area_of_house=sc.nextDouble();
	   
	   if(materialstandard.equals("standard"))
	   {
		   total_cost_of_construction=1200* area_of_house;
		   System.out.println("total cost of construction is "+total_cost_of_construction);
	   }
	   else if(materialstandard.equals("above standard"))
	   {
		   total_cost_of_construction=1500* area_of_house;
		   System.out.println("total cost of construction is "+total_cost_of_construction);
	   }
	   else if(materialstandard.equals("high standard"))
	   {
		   total_cost_of_construction=1800* area_of_house;
		   System.out.println("total cost of construction is "+total_cost_of_construction);
	   }
	   else if(materialstandard.equals("high standard and fully automated"))
	   {
		   total_cost_of_construction=2500* area_of_house;
		   System.out.println("total cost of construction is "+total_cost_of_construction);
	   }
   }
}
