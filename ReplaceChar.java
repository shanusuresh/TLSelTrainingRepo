package week1HW;

/*Pseudocode:
 
 1.Get the input string
 2.Store the length of the string and convert the string to character array using str.toCharArray()
 3. Iterate to find the replaceable char in the char Array
 4. If the char Array equals to the replaceableChar then replace by the char
 5. Print the char Array
 */

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "priya";
		int length = str.length();
		char input[] = str.toCharArray();
		char replaceableChar = 'r';
		char replaceBy = 'i';
		for (int i = 0; i < length; i++) {
			if (input[i] == replaceableChar) {
				input[i] = replaceBy;
			}
			System.out.print(input[i]);
		}

	}
}
