import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

       /*
        map(Function<? super T,? extends R> mapper)
        Purpose: Transforms each element of the stream using the provided function.
         Each element in the stream is mapped to exactly one other element in the output stream.
        Usage Scenario: When you want to apply a function to each element of the stream to 
        transform them into another form one-to-one. For example, converting a list of Integer 
        values to their square values.
        Type of Operation: One-to-one mapping from the elements of the input stream to the elements
         of the output stream.
        Return Type: Stream<R> - It returns a stream consisting of the results of applying the
         given function to the elements of this stream.

       
         Using map: Suppose you have a list of numbers and you want to square each number.
       */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> squares = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        squares.forEach(System.out::println);



/*
        flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
        Purpose: Flattens multiple Stream objects into a single stream. 
        The provided mapping function generates a stream for each element, 
        and flatMap merges all these streams into a single stream.
        Usage Scenario: When each element of the stream is a collection 
        (or a stream) and you want to create a stream of items by merging all
         these collections or streams. For example, flattening a list of lists into a single list.
        Type of Operation: Mapping from one element to multiple elements (one-to-many) 
        and then flattening the result into a single stream.
        Return Type: Stream<R> - It returns a stream consisting of the elements of the
         streams produced 

Using flatMap: Suppose you have a list of lists of numbers, and you want to
 create a single list containing all the numbers.



*/
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> flatList = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        flatList.forEach(System.out::println);

    }

}