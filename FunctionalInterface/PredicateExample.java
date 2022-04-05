package FunctionalInterface;

import StudentPkg.Student;
import StudentPkg.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p = (s) -> (s%2 == 0);
    static Predicate<Integer> p1 = (s) -> (s%5 == 0);

    static Predicate<Student> grade = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> gpa = (s) -> s.getGpa()>=3.9;

    static BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade>=3&&gpa>=3.9;

    public static void filterStudentByGradeLevel(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if(grade.and(gpa).test(student)){
                System.out.println(student);;
            }
        }
        );

    }


    public static void filterStudentByGradeLevelBiPredicate(){

        System.out.println("filterStudentByGradeLevelBiPredicate********");
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
                    if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
                        System.out.println(student);;
                    }
                }
        );

    }

    public static void predicateAnd(){

        //predicate chaining
        System.out.println( p.and(p1).test(10));
        System.out.println( p.or(p1).test(9));
        System.out.println( p.or(p1).test(8));

        System.out.println( p.or(p1).negate().test(9)); //reverse the result--negate

    }

    public static void main(String[] args) {

        System.out.println(p.test(4));
        predicateAnd();

        filterStudentByGradeLevel();

        filterStudentByGradeLevelBiPredicate();

    }

//    public static void example(){
//
//        Predicate<Integer> pre = (x) -> x>=3;
//
//        List<Student> students = StudentDataBase.getAllStudents();
//        students.stream().filter(pre).forEach(System.out::println);
//    }
}
