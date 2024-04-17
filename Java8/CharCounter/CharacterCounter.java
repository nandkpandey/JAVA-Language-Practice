package Java8.CharCounter;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class CharacterCounter {
    public static void main(String[] args) {
        String s = "string data to count each character";
        
        Map<Character, Long> characterFrequency = s.chars() // Convert the string to an IntStream of characters
            .mapToObj(c -> (char) c) // Convert int values to Character
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Group and count
        
        System.out.println(characterFrequency);
    }
}