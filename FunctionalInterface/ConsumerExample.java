package FunctionalInterface;

import StudentPkg.Student;
import StudentPkg.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {



    static Consumer<Student> c = (s) -> System.out.println(s.getName());

    static Consumer<Student> c1 = (s) -> System.out.println(s.getActivities());


    public static void printName(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((s) -> System.out.println(s.getName()));

    }

    public static void printNameAndActivities(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(c.andThen(c1));

    }

    public static void printNameAndActivitiesByUsingCondition(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if(student.getGradeLevel()>=3){
                c.andThen(c1).accept(student);
            }
        });

    }

    public static void main(String[] args) {
        Consumer<String> c = (s) -> System.out.println("The variable is : " + s.toUpperCase());
        c.accept("vishal");

     //   printName();

       // printNameAndActivities();

        printNameAndActivitiesByUsingCondition();
    }
}
