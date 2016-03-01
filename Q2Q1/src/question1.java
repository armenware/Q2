import java.util.Scanner;

public class question1 {
	private static int initial_cost;
	private static double percent_increase;
	private static double APR;
	private static int term;
	private static int total_tuition;

	public static void main(String[] args) {
		// User Input
		Scanner sc = new Scanner(System.in);
		question1 object = new question1();

		// Initial tuition
		System.out.println("Tuition rate: ");
		initial_cost = sc.nextInt();

		// percent increase
		System.out.println("Percentage increases for tuition: ");
		percent_increase = sc.nextDouble();

		// four year cost
		total_tuition = object.total_cost(initial_cost, percent_increase);
		System.out.printf("Your total cost after 4 years: %d", object.total_cost(initial_cost, percent_increase));

		// APR
		System.out.println("\nAnnual Percentage Rate: ");
		APR = sc.nextDouble();

		// Term
		System.out.println("Term: ");
		term = sc.nextInt();
		System.out.printf("Your monthly payment: %d", object.monthly_payment(total_tuition, APR, term));
	}

	// Calculates the total cost
	public int total_cost(int initial, double percent_increase) {
		return (int) (initial * percent_increase + initial) * 4;
	}

	// Calculates monthly payment
	public int monthly_payment(int fourYearCost, double APR, int term) {
		int sum = 0;
		for (int i = 0; i < term; i++) {
			sum = (int) (fourYearCost * (1.0 + APR));
		}
		return sum / (term * 12);
	}
}
