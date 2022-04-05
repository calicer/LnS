package Stream;

import StudentPkg.Student;
import StudentPkg.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMap {

    //Convert one type to another

    public static List<String> namesList(){
        //map takes function as input Function<T,R>
       return StudentDataBase.getAllStudents().stream()
               .map(Student::getName)
               .map(String::toUpperCase)
               .collect(Collectors.toList());
    }

    public static Set<String> namesSet(){
        //map takes function as input Function<T,R>
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
