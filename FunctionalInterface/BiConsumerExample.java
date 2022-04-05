package FunctionalInterface;

import StudentPkg.Student;
import StudentPkg.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {


    public static void getNameAndActivities(){
        List<Student> students = StudentDataBase.getAllStudents();

        BiConsumer<String, List<String>> biConsumer =  (a,b) -> {
            System.out.println("names: " + a + " activities: " + b);
        };

        students.forEach((student -> biConsumer.accept(student.getName(), student.getActivities())));
    }

    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer = (a, b) -> {
            System.out.println("a: " + a + ", b: " + b);
        };

        biConsumer.accept("A","B");

        BiConsumer<Integer, Integer> multiply = (a,b) -> System.out.println(a*b);

        BiConsumer<Integer, Integer> division = (a,b) -> System.out.println(a/b);

        multiply.andThen(division).accept(12,4);

        getNameAndActivities();

    }
}
