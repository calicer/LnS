package Stream;

import StudentPkg.Student;
import StudentPkg.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {


    public static void sortStudentByName(){
        StudentDataBase.getAllStudents().stream()
                .sorted((a,b) -> a.getName().compareTo(b.getName()))
                .forEach(System.out::println);
    }

    public static List<Student> sortStudentByName1(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        sortStudentByName();

        System.out.println(sortStudentByName1());
    }

}
