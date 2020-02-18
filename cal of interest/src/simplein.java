
import java.util.Scanner;
public class simplein  {

     public static void main(String[] args)
     {
    	Scanner sc=new Scanner(System.in);
    	double principal,time,rate,simple_interest,compound_interest,a;
    	 System.out.println("enter principal value");
    	 principal=sc.nextDouble();
    	 System.out.println("enter time period");
    	 time=sc.nextDouble();
    	 System.out.println("enter rate value");
    	 rate=sc.nextDouble();
    	 simple_interest=(principal*time*rate)/100;
    	 System.out.println("simple interest value is "+simple_interest);
    	 a=1+(rate/100);
    	 compound_interest=(principal*Math.pow(a, time))-principal;
    	 System.out.format("compound interest value is  "+compound_interest);
     }
}

