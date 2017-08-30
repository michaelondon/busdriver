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

			System.out.print("\n");
			
			// Math to show the number of passenger currently remaining ON the bus
			currentPassenagers = currentPassenagers + (passenagersGettingOn - passenagersGettingOff);
			totalFare = (totalFare + passenagersGettingOn);

			// If there are no more passengers the console will print the total fare.
			if (currentPassenagers <= 0) {
				System.out.println("There are no more passenagers on the bus the total fare is $" + totalFare * 1.50);
			} else if (currentPassenagers >= 0) {
				System.out.println(currentPassenagers + " passersenger(s) currently on the bus.");
			}
			
			System.out.print("\n");
			
			// if driver types "Y/y" the program will loop back to the beginning.
			System.out.println("Would you like to proceed to the next stop Y/N?");
			nextStep = input.next().toUpperCase();

			System.out.print("\n");

		
		
			// begins the loop.
		} while (nextStep.equals("Y"));
		
	 if (nextStep.equals("N"));
	System.out.println("Total passenager fare $" + totalFare * 1.50);


		System.out.println("There are " + currentPassenagers + " passersengers remaining on the bus.");

	
}
}