package javaHomework02;

import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		System.out.println("Ievadi v�rdu un uzv�rdu vien� rind� ar atstarpi");
		
		Scanner userInput = new Scanner(System.in);
		String input = userInput.nextLine();
		userInput.close();
		
		String[] arrayInp = input.split(" ");
//		System.out.println(Arrays.toString(arrayInp));
		
		/* for cikls, ja ir vair�ki v�rdi (neierobe�ots skaits),
		*bet nem�ku izdab�t �r� no cikla datus, lai format�tu tos vien� rind� ,
		*piem�ram, 'Marija Paula'
		*/
		
		for (int i = 0; i<arrayInp.length-1; i++) {
			String name = arrayInp[i];
			String nameFormated = (name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
			System.out.println(String.format("'%s'", nameFormated));
			};
				
		String surname = arrayInp[arrayInp.length-1].toUpperCase();
		System.out.println(String.format("'%s'", surname));
	}

}