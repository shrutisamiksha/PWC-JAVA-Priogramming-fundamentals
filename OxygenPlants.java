import java.util.Scanner;
public class OxygenPlants {

	public static void main(String[] args) {
		// TODO Auto-generated method stubimport java.util.Scanner;
			 
			 // fill code here
			 Scanner sc= new Scanner(System.in);

			 System.out.println("Enter the length of the room(in m)");
			 double l= sc.nextDouble();

			Outer : {

			 if(l<=0)
			 {
			 System.out.println("Invalid length");
			 break Outer;
			 }

			 System.out.println("Enter the breadth of the room(in m)");
			 double b= sc.nextDouble();

			 if(b<=0)
			 {
			 System.out.println("Invalid breadth");
			 break Outer;
			 }

			 System.out.println("Enter the plant area of a single plant(in cm2)");
			 double plantArea= sc.nextDouble();

			 if(plantArea<=0)
			 {
			 System.out.println("Invalid plant area");
			 break Outer;
			 }

			 int totalPlants= (int)((l*b)/(plantArea/10000));

			 if(totalPlants%10!=0)
			 {
			 int rem=totalPlants%10;
			 totalPlants=totalPlants-rem;
			 }

			 double production= 0.9*totalPlants;

			 System.out.println("Total number of plants is "+totalPlants);

			 System.out.printf("Total oxygen production is %.2f litres",production);
			 }
			 }
	}

