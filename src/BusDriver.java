import java.util.Scanner;

public class BusDriver {

	private static final int currentRiders = 0;
	private static final int scan = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nextStep = "";
		int currentPassenagers = 0;
		double totalFare = 0.00;

		do {
				
						
			// Ask driver to input number of passengers getting ON the bus at this stop
			System.out.println("Passenagers getting On");
			int passenagersGettingOn = input.nextInt();

			// Ask driver to input number of passengers getting OFF the bus at this stop
			System.out.println("Passenagers getting off");
			int passenagersGettingOff = input.nextInt();

			// Show the number of passenger that got ON and OFF at the stop
			System.out.println(passenagersGettingOn + " passenagers got on at this stop.");
			System.out.println(passenagersGettingOff + " passenagers got off at this stop.");

			// Math to show the number of passenger currently remaining ON the bus
			currentPassenagers = currentPassenagers + (passenagersGettingOn - passenagersGettingOff);
			totalFare = (totalFare + passenagersGettingOn);
		

			// Show the number of passenger currently remaining ON the bus
		
			
			
			
//			 if currentPassenagers=<0{ 
//				 System.out.println("Total passenager fare $" + totalFare * 1.50);
//			 
//			 }
			System.out.println("Would you like to proceed to the next stop Y/N?");
			nextStep = input.next().toUpperCase();

			System.out.print("\n");

			// if (currentPassenagers <= 0)
			
			

		} while (nextStep.equals("Y"));

		System.out.println(currentPassenagers);

		System.out.println("Total passenager fare $" + totalFare * 1.50);

	}
}
