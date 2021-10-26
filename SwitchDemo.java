package Marks;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		for(;;)
		{
		// TODO Auto-generated method stub
		int i,n1,n2;
		System.out.println("1. Add 2 no’s");
		System.out.println("2. Find average of 2 numbers");
		System.out.println("3. Check even/odd");
		System.out.println("4. Check positive or negative number");
		System.out.println("5. check prime no or not ");
		System.out.println("6. Quit");
		System.out.println("Enter your choice:");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		switch(i) 
		{
			case 1: System.out.println("Enter the numbers: ");
					n1=sc.nextInt();
					n2=sc.nextInt();
					System.out.println("Sum: "+(n1+n2));
					System.out.println("\n");
					break;
			case 2: System.out.println("Enter the numbers: ");
					n1=sc.nextInt();
					n2=sc.nextInt();
					System.out.println("Average: "+((n1+n2)/2));
					System.out.println("\n");
					break;
			case 3: System.out.println("Enter the number: ");
					n1=sc.nextInt();
					if(n1%2==0)
					{
						System.out.println(n1+"is an Even number");
					}
					else
					{
						System.out.println(n1+"is an Odd number");
					}
					System.out.println("\n");
					break;
			case 4: System.out.println("Enter the number: ");
					n1=sc.nextInt();
					if(n1<0)
						System.out.println(n1+" is a Negative number");
					else
						System.out.println(n1+" is a Positive number");
					System.out.println("\n");
					break;
			case 5: System.out.println("Enter the number: ");
					n1=sc.nextInt();
					int m=n1/2;
					int flag=0;
					if(n1==0||n1==1) 
					{ 
					   System.out.println(n1+" is not a prime number"); 
					}
					else
					{  
					   for(int j=2;j<=m;j++)
					   {      
						   if(n1%j==0)
						   {      
							   System.out.println(n1+" is not a prime number");      
							   flag=1;      
							   break;      
						   }      
					   }      
					   if(flag==0)  
					   { 
						   System.out.println(n1+" is a prime number"); 
					   }  
					  }
					System.out.println("\n");
					break;
			case 6: System.exit(0);
			default: System.out.println("Enter number between 1 and 6");
		}
		}
		}
		

}
