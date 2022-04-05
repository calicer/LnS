package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamsMinMaxExample {

    public static int  findMaxValue(List<Integer> list){
        return list.stream()
                .reduce(0, (x,y) -> x>y ? x:y);
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6,7,8,9,10,1);

        System.out.println(findMaxValue(list));
    }
}
