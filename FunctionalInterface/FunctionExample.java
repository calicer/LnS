package FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {


    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {

        System.out.println(function.apply("vishal"));

        System.out.println(function.andThen(addSomeString).apply("vishal"));

        System.out.println(function.compose(addSomeString).apply("vishal"));
        
    }
}
