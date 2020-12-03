
package javaHomework02;

import java.util.Scanner;

public class DateValidator {
	
	public static boolean isInArray (int month, int[] array) {
		for (int i=0; i< array.length; i++) {
			if (month == array[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Datums: ");
		Scanner scan = new Scanner(System.in);
		int date = scan.nextInt();
				
		while (date <= 0 || date > 31) {
			System.out.println("K��da, l�dzu ievadi datumu: ");
			date = scan.nextInt();
		};
		
		System.out.println("M�nesis(1-12): ");
		int month = scan.nextInt();
				
		while (month <= 0 || month > 12) {
			System.out.println("K��da, l�dzu ievadi m�nesim atbilsto�u skaitli(1-12): ");
			month = scan.nextInt();
		};
		
		System.out.println("Gads: ");
		int yearNum = scan.nextInt();
		
		while (yearNum <= 0) {
			System.out.println("K��da, l�dzu ievadi gada skaitli: ");
			yearNum = scan.nextInt();
		};
		
		scan.close();
				
		String[] year = {
				"janv�ris",
				"febru�ris",
				"marts",
				"apr�lis",
				"maijs",
				"j�nijs",
				"j�lijs",
				"augusts",
				"septembris",
				"oktobris",
				"novembris",
				"decembris"				
		};
		
		int[]month31days = {1,3,5,7,8,10,12};
		int[]month30days = {4,6,9,11};
		int month28days = 2;
		
		if (date <= 31 && isInArray(month, month31days)) {
			System.out.println(date + ". " + year[month-1] + " " + yearNum);
		} else if (date <= 30 && isInArray(month, month30days)){
			System.out.println(date + ". " + year[month-1] + " " + yearNum);			
		} else if (date <=29 && month == month28days && yearNum % 4 == 0) {
			System.out.println(date + ". " + year[month-1] + " " + yearNum);
		} else if (date <=28 && month == month28days) {
			System.out.println(date + ". " + year[month-1] + " " + yearNum);
		} else {
			System.out.println("K��da, dienu skaits neatbilst nor�d�tajam m�nesim");
		};

	}

}

