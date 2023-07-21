import java.util.*;
public class AlternativelyReverseString
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        // Split the string into two halves
        int length = s.length();
        int mid = length / 2;
        String firstHalf = s.substring(0, mid);
        String secondHalf = s.substring(mid, length);
        
        // Combine the characters of the two halves alternately in reverse order
        StringBuilder result = new StringBuilder();
        for (int i = mid - 1, j = length - mid - 1; i >= 0 || j >= 0; i--, j--) {
               if (i >= 0) {
               result.append(firstHalf.charAt(i));
               }
               if (j >= 0) {
               result.append(secondHalf.charAt(j));
             }
        }
        
        
        System.out.println("Result: " + result.toString());

	}
}

