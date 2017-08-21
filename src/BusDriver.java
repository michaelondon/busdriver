import java.util.Scanner;

public class BusDriver {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nextStep;
		
		
do {

	
	
		System.out.println("Riders On");
		int ridersGettingOn=input.nextInt();

		System.out.println("Riders off");
		int ridersGettingOff=input.nextInt();
		
	
		System.out.println(ridersGettingOn +" riders got on at this stop.");
		
		System.out.println(ridersGettingOff +" riders got off at this stop.");
		
		int currentRiders= ridersGettingOn-ridersGettingOff;
		
				
		System.out.println (currentRiders + " currently on the bus.");
		
		
		System.out.println("select 1 to end this route or 2 to proceed to the next stop?");
		nextStep=input.nextInt();
		
		System.out.print("\n");
		
	
		
}while(nextStep==2);
   	

 
}
}
 