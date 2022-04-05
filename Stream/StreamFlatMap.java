package Stream;

import StudentPkg.Student;
import StudentPkg.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {

    //same as of map but used in the context of stream where each element in the stream represents multiple elements
    //Example Stream<List>, Stream<Arrays>

    public static List<String> printActivities(){
       List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)  //Will give us Stream<List<String>>
               .flatMap(List :: stream)  // Stream<String>
                .collect(Collectors.toList());

       return studentActivities;
    }


    public static Long uniqueActivities(){
        Long studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)  //Will give us Stream<List<String>>
                .flatMap(List :: stream)  // Stream<String>
                .distinct()
                .count();


        return studentActivities;
    }

    public static List<String> printActivitiesSorted(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)  //Will give us Stream<List<String>>
                .flatMap(List :: stream)  // Stream<String>
                .sorted()
                .collect(Collectors.toList());

        return studentActivities;
    }


    public static void main(String[] args) {

        System.out.println(printActivities());

        System.out.println(uniqueActivities());

        System.out.println(printActivitiesSorted());
    }
}
