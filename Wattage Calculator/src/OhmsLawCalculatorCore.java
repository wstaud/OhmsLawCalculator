import java.util.*;

public class OhmsLawCalculatorCore {
	
	
	
	public static void main(String[] args){
	
		double voltage, resistance, power, current;
		String powerKnown, resistanceKnown, voltageKnown, currentKnown;
		
	
	
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ohms Law Calculator! Press enter to continue.");
		reader.nextLine();
		System.out.println("Input yes or no for the following four questions, then press enter: Do you know your wattage?"); //gather all known variables
		powerKnown = reader.nextLine();
		System.out.println("Do you know your ohms?");
		resistanceKnown = reader.nextLine();
		System.out.println("Do you know your voltage?");
		voltageKnown = reader.nextLine();
		System.out.println("Do you know your amps?");
		currentKnown = reader.nextLine();
		
	
		
		//User knows Voltage and Resistance
		if((voltageKnown.equalsIgnoreCase("yes") || voltageKnown.equalsIgnoreCase("y")) && (resistanceKnown.equalsIgnoreCase("yes") || resistanceKnown.equalsIgnoreCase("y"))
				&& (currentKnown.equalsIgnoreCase("no") || currentKnown.equalsIgnoreCase("n")) && (powerKnown.equalsIgnoreCase("no") || powerKnown.equalsIgnoreCase("n"))){
			System.out.println("What is your mods total voltage? (account for series)");
			voltage = reader.nextDouble();
			
			System.out.println("What is your total resistance?");
			resistance = reader.nextDouble();
	
			
		current = (voltage / resistance);
		power = (voltage * current);	
		System.out.println("Your Wattage is: " + power + " watts" + " and your Current is: " + current + " amps");	
			
		//User knows Power and Voltage
		}else if((voltageKnown.equalsIgnoreCase("yes") || voltageKnown.equalsIgnoreCase("y")) && (powerKnown.equalsIgnoreCase("yes") || powerKnown.equalsIgnoreCase("y"))
				&& (currentKnown.equalsIgnoreCase("no") || currentKnown.equalsIgnoreCase("n")) && (resistanceKnown.equalsIgnoreCase("no") || (resistanceKnown.equalsIgnoreCase("n")))){
			System.out.println("What is your mods total voltage? (account for series)");
			voltage = reader.nextDouble();
			
			System.out.println("What is your total wattage?");
			power = reader.nextDouble();
	
			
		current = (power / voltage);
		resistance = (voltage / current);	
		System.out.println("Your Current is: " + current + " amps" + " and your Resistance is: " + resistance + " ohms");	
			
		//user knows Power and Current
		}else if((currentKnown.equalsIgnoreCase("yes") || currentKnown.equalsIgnoreCase("y")) && (powerKnown.equalsIgnoreCase("yes") || powerKnown.equalsIgnoreCase("y"))
				&& (voltageKnown.equalsIgnoreCase("no") || voltageKnown.equalsIgnoreCase("n")) && (resistanceKnown.equalsIgnoreCase("no") || resistanceKnown.equalsIgnoreCase("n"))){
			System.out.println("What is your total amps?");
			current = reader.nextDouble();
			
			System.out.println("What is your total wattage?");
			power = reader.nextDouble();
	
			
		voltage = (power / current);
		resistance = (voltage / current);	
		System.out.println("Your Voltage is: " + voltage + " volts" + " and your Resistance is: " + resistance + " ohms");	
			
		//User knows Power and Resistance
		}else if((powerKnown.equalsIgnoreCase("yes") || powerKnown.equalsIgnoreCase("y")) && (resistanceKnown.equalsIgnoreCase("yes") || resistanceKnown.equalsIgnoreCase("y"))
				&& (voltageKnown.equalsIgnoreCase("no") || voltageKnown.equalsIgnoreCase("n")) && (currentKnown.equalsIgnoreCase("no") || currentKnown.equalsIgnoreCase("n"))){
			System.out.println("What is your total ohms?");
			resistance = reader.nextDouble();
			
			System.out.println("What is your total wattage?");
			power = reader.nextDouble();
	
			
		voltage = (power * resistance);
		voltage = Math.sqrt(voltage);
		current = (power / voltage);	
		System.out.println("Your Voltage is: " + voltage + " volts" + " and your Current is: " + current + " amps");	
			
		
		//User knows Voltage and Current
		}else if((voltageKnown.equalsIgnoreCase("yes") || voltageKnown.equalsIgnoreCase("y")) && (currentKnown.equalsIgnoreCase("yes") || currentKnown.equalsIgnoreCase("y"))
				&& (powerKnown.equalsIgnoreCase("no") || powerKnown.equalsIgnoreCase("n")) && (resistanceKnown.equalsIgnoreCase("no") || resistanceKnown.equalsIgnoreCase("n"))){
			System.out.println("What is your mods total voltage? (account for series)?");
			voltage = reader.nextDouble();
			
			System.out.println("What is your total amps?");
			current = reader.nextDouble();
	
			
		power = (voltage * current);
		resistance = (voltage / current);	
		System.out.println("Your power is: " + power + " watts" + " and your Resistance is: " + resistance + " ohms");	
			
		
		//User knows Resistance and Current
		}else if((resistanceKnown.equalsIgnoreCase("yes") || resistanceKnown.equalsIgnoreCase("y")) && (currentKnown.equalsIgnoreCase("yes") || currentKnown.equalsIgnoreCase("y"))
				&& (powerKnown.equalsIgnoreCase("no") || powerKnown.equalsIgnoreCase("n")) && (voltageKnown.equalsIgnoreCase("no") || (voltageKnown.equalsIgnoreCase("n")))){
			System.out.println("What is your total ohms?");
			resistance = reader.nextDouble();
			
			System.out.println("What is your total amps?");
			current = reader.nextDouble();
	
			
		power = ((current * current) * resistance);
		voltage = (resistance * current);	
		System.out.println("Your power is: " + power + " watts" + " and your Voltage is: " + voltage + " volts");	
			
		}else
			System.out.println("User invalid input!!!");
		
		
		
		
			
	
	
	}
	
	

}
