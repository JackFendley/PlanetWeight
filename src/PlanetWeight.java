import java.util.Scanner;

/**
 * 
 */

/**
 * @author j.fendley
 *
 */
public class PlanetWeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner userInput = new Scanner(System.in);
				
			double userWeight;
			String userPlanet = "";
			
			do {
				System.out.print("How much do you weigh? ");
				userWeight = userInput.nextDouble();
				
				if(userWeight <= 1){
					System.out.print("Please enter your actual weight ");
					userWeight = userInput.nextDouble();
				}
			
			}while(userWeight <= 1);
			
			System.out.print("Please enter a celestial body: ");
			userPlanet = userInput.next();
			
			if(userPlanet.equalsIgnoreCase("Mercury" )){
				System.out.println("Your weight on Mercury is: " + userWeight * 0.38);
			}
				
			if(userPlanet.equalsIgnoreCase("Venus")){
				System.out.println("Your weight on Venus is: " + userWeight * 0.91);
			}
				
			if(userPlanet.equalsIgnoreCase("Earth")){
				System.out.println("Your weight on Earth is: " + userWeight * 1);
			}
				
			if(userPlanet.equalsIgnoreCase("Moon")){
				System.out.println("Your weight on Moon is: " + userWeight * 0.165);
			}
				
			if(userPlanet.equalsIgnoreCase("Mars")){
				System.out.println("Your weight on Mars is: " + userWeight * 0.38);
			}
				
			if(userPlanet.equalsIgnoreCase("Jupiter")){
				System.out.println("Your weight on Jupiter is: " + userWeight * 2.34);
			}
				
			if(userPlanet.equalsIgnoreCase("Saturn")){
				System.out.println("Your weight on Saturn is: " + userWeight * 1.06);
			}
				
			if(userPlanet.equalsIgnoreCase("Uranus")){
				System.out.println("Your weight on Uranus is: " + userWeight * 0.92);
			}
				
			if(userPlanet.equalsIgnoreCase("Neptune")){
				System.out.println("Your weight on Neptune is: " + userWeight * 1.19);
			}
				
			if(userPlanet.equalsIgnoreCase("Pluto")){
				System.out.println("Your weight on Pluto is: " + userWeight * 0.06);
			}
			userInput.close();
	}

}
