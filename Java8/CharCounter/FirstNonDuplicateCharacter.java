import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonDuplicateCharacter {
    public static void main(String[] args) {
        String input = "swiss";

        Character firstNonDuplicate = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);

        if (firstNonDuplicate != null) {
            System.out.println("First non-duplicate character: " + firstNonDuplicate);
        } else {
            System.out.println("No non-duplicate character found.");
        }
    }
}
