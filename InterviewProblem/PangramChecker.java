package InterviewProblem;

/**Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.
Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the characters from ‘a’ to ‘z’]
“The quick brown fox jumps over the dog” is not a Pangram [Doesn’t contains all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing]
And print the missing characters or empty String. */



import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public static String checkPangram(String input) {
        // Define a set to hold the letters of the alphabet
        Set<Character> alphabetSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(c);
        }

        // Convert the input string to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        // Check each character in the input string
        for (char c : input.toCharArray()) {
            // Remove the character from the alphabet set if it's a letter
            if (alphabetSet.contains(c)) {
                alphabetSet.remove(c);
            }
        }

        // If the alphabet set is empty, the input is a pangram
        if (alphabetSet.isEmpty()) {
            return "";
        } else {
            // Convert the set of missing characters to a string
            StringBuilder missingChars = new StringBuilder();
            for (char c : alphabetSet) {
                missingChars.append(c);
            }
            return missingChars.toString();
        }
    }

    public static void main(String[] args) {
        String test1 = "The quick brown fox jumps over the lazy dog";
        String test2 = "The quick brown fox jumps over the dog";

        System.out.println("Missing characters in test1: " + checkPangram(test1)); // Should print empty string
        System.out.println("Missing characters in test2: " + checkPangram(test2)); // Should print missing characters
    }
}




