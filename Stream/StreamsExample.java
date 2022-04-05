package Stream;

import StudentPkg.Student;
import StudentPkg.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> predicateStudent = (student -> student.getGradeLevel()>=3);
    static Predicate<Student> predicateGPAStudent = (student -> student.getGpa()>=3.9);

    public static void main(String[] args) {
      Map<String, List<String>> map = StudentDataBase.getAllStudents().stream()
              .peek((student -> {
                  System.out.println(student);
              }))
              .filter(predicateStudent)
              .filter(predicateGPAStudent)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(map);


    }
}
