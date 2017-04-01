import java.util.Scanner;

public class ExceptionStringIndexOOB {
	public static void main(String[] args) {
		int len, val;
		char ans = 'N';
		String str;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Please enter a string:");
			str = sc.nextLine();
			len = str.length();
			System.out.println("Length of the string is: " + len);
			do {
				System.out
						.println("Enter any index value to print the character at that location: ");
				val = sc.nextInt();
				System.out.println("The character at index " + val + " is: "
						+ str.charAt(val));
				System.out.println();
				System.out.println("Do you want to continue (Y/N): ");
				ans = sc.next().charAt(0);
			} while (ans == 'Y');
		} catch (StringIndexOutOfBoundsException se) {
			ans = 'N';
			System.out.println("String index out of bound exception: " + se);
		} catch (Exception e) {
			ans = 'N';
			System.out.println("Exception in code - " + e);
		}

	}
}
