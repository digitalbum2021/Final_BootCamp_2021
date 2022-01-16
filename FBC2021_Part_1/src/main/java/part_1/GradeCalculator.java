package part_1;


import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Students ID");
		String sID = input.next();

		System.out.println("Score in Math");
		int mathScr = input.nextInt();

		System.out.println("Score in Biology");
		int bioScr = input.nextInt();

		System.out.println("Score in Chemistry");
		int chemScr = input.nextInt();
		
		int subTotal = mathScr+bioScr+chemScr;

		int total=subTotal/3;


		System.out.println("Students ID: " + sID);
		System.out.println("Math Score: " + mathScr);
		System.out.println("Biology Score: " + bioScr);
		System.out.println("Chemistry Score: " + chemScr);
		System.out.println("Total Score : "+ subTotal);
		System.out.println("Average Score: "+ total);

		if (total>=90 && total <=100) {
			if (total>=97 && total <=100) {
				System.out.println("Your grade is: A+");
			}
			else if (total>=93 && total <=96) {
				System.out.println("Your grade is: A");
			}
			else {
				System.out.println("Your grade is: A-");
			}
			
		}
		else if (total>=80 && total <=89) {
			if (total>=87 && total <=89) {
				System.out.println("Your grade is: B+");
			}
			else if (total>=83 && total <=86) {
				System.out.println("Your grade is: B");
			}
			else {
				System.out.println("Your grade is: B-");
			}
			
		}
		else if (total>=70 && total <=79) {
			if (total>=77 && total <=79) {
				System.out.println("Your grade is: C+");
			}
			else if (total>=73 && total <=76) {
				System.out.println("Your grade is: C");
			}
			else {
				System.out.println("Your grade is: C-");
			}
			
		}
		else if (total>=60 && total <=69) {
			if (total>=67 && total <=69) {
				System.out.println("Your grade is: D+");
			}
			else if (total>=63 && total <=66) {
				System.out.println("Your grade is: D");
			}
			else {
				System.out.println("Your grade is: D-");
			}
			
		}
		else {
			System.out.println("Your grade is: F");
		}



	}

}
