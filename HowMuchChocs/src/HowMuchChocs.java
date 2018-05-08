public class HowMuchChocs {
	public static void maxNumChocs(int money, int cost, int wrap) {
		// Purchase of chocolates:
		int numOfChocsThisStep = money/cost; // Calculation of the number of purchased chocolates at this step
		int restMoney = money%cost; // Calculation of the number of rest money

		int numOfChocsSum = numOfChocsThisStep; // Calculation of the sum of purchased chocolates
		
		// Eating of chocolates:
		int numOfWrapsThisStep = numOfChocsThisStep; // Calculation of the number of wraps at this step
		int restWraps = 0; // Number of rest wraps (remainder) from previous step
		
		// exchange of wrappers for chocolates:
		while (numOfWrapsThisStep+restWraps >= wrap) {
			numOfChocsThisStep = (numOfWrapsThisStep+restWraps)/wrap; // Calculation of the number of exchanged chocolates at this step
			restWraps = (numOfWrapsThisStep+restWraps)%wrap; // Number of rest wraps (remainder) that will be used at next step

			numOfChocsSum += numOfChocsThisStep;  // Calculation of the sum of purchased and exchanged chocolates
			numOfWrapsThisStep = numOfChocsThisStep; // Eating of chocolates: Calculation of the number of wraps at this step
		}
				
		System.out.println("Ты сможешь приобрести максимум " + numOfChocsSum + " шок.");
		System.out.println("У тебя останется в кармане " + (numOfWrapsThisStep+restWraps) + " обер.");
		System.out.println("А в кошельке " + restMoney + " $.");
	}
}
