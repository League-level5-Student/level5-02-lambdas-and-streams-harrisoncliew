package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String backwards = "";
			for (int i = s.length()-1; i > -1; i--) {
				backwards+=s.charAt(i);
			}
			System.out.println(backwards);
		},"backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String finalString = "";
			for (int i = 0; i < s.length(); i++) {
				if(Character.isLetter(s.charAt(i))) {
					if(i%2==0) {
						finalString += Character.toUpperCase(s.charAt(i));
					} else {
						finalString += Character.toLowerCase(s.charAt(i));
					}
				} else {
					finalString += s.charAt(i);
				}
			}
			System.out.println(finalString);
		}, "Capital letters and lowercase letters");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String custom = "";
			for (int i = 0; i < s.length(); i++) {
				custom += s.charAt(i);
				custom += '.';
			}
			System.out.println(custom);
		},"periods between each character");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String custom = "";
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i) !='o' && s.charAt(i)!='u') {
					custom+=s.charAt(i);
				}
			}
			System.out.println(custom);
		}, "No more vowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
