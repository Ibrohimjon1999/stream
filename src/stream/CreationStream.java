package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationStream {

    public Stream<String> toStream(List<String> list){
        if(list==null){
            return Stream.empty();
        }
        return list.stream();
    }
    public static void main(String[] args) {

//        Stream of Collection
        List<Integer> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);

        Stream<Integer> stream = numbers.parallelStream();
        stream.forEach(s-> System.out.println(s));

//        Stream of Array
        String[] words = {"Salom", "Jigar", "Bormisan", "Jallimisan", "Mazgi"};
        Stream<String> streamString = Arrays.stream(words);
        streamString.forEach(s-> System.out.println(s));

//        Stream.of()
        Stream<String> streamOfArray = Stream.of("a","b","c");
        streamOfArray.forEach(s-> System.out.println(s));

//        Stream.builder()
        Stream<String> streamBuilder = Stream.<String>builder()
                .add("Ali")
                .add("Vali")
                .add("Toshmat").build();
        streamBuilder.forEach(s-> System.out.println(s));

//        Stream.generate()
        Stream<String> streamGenerated =
                Stream.generate(() -> "dasturlash.uz").limit(5);
        streamGenerated.forEach(s -> System.out.println(s));

//        try {
//            Stream<String> stream1 = Files.lines(Paths.get("testFile.txt"));
//            stream.forEach(s -> System.out.println(s));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Empty Stream");
        IntStream emptyStream = IntStream.empty();
        emptyStream.forEach(s -> System.out.print(s));

        System.out.println("\nInt array Stream");
        IntStream intStream = IntStream.of(1, 2, 3, 4);
        intStream.forEach(s -> System.out.print(s));

        System.out.println("\nStream in range");
        IntStream rangeStream = IntStream.range(10, 15); // [10,11,12,13,14]
        rangeStream.forEach(s -> System.out.print(s));
    }
}
