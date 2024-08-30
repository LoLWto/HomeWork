import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        deleatRepeat();
        lineСounting();
        secondInLine();
    }



    private static void deleatRepeat() {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 7, 7);

        List<Integer> deleatRepeat = num.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(deleatRepeat);

    }

    private static void lineСounting(){
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown", "Grey");

        long lineСounting = colors.stream()
                .filter(s -> s.startsWith("G"))
                .count();


        System.out.println(lineСounting);

    }

    private static  void secondInLine(){
        List<Integer> nums = Arrays.asList(3, 4, 5 ,6, 7, -11);

        List<Integer> result = Collections.singletonList(nums.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null));

        System.out.println(result);

    }

}