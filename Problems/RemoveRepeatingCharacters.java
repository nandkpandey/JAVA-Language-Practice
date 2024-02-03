package Problems;

import java.util.stream.Collectors;

public class RemoveRepeatingCharacters {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String result = removeRepeatingCharacters(input);
        System.out.println("Original String: " + input);
        System.out.println("String with Repeating Characters Removed: " + result);
    }

    public static String removeRepeatingCharacters(String input) {
        // Convert the string to a stream of characters
        return input.chars()
                .mapToObj(ch -> (char) ch)
                // Use distinct() to filter out duplicate characters
                .distinct()
                // Collect the distinct characters back into a string
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
//Normal
  /*  public static String removeRepeatingCharacters(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
*/
}

