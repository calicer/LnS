package Stream;

import StudentPkg.Student;
import StudentPkg.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

    //Reduce the contents of stream to a single value
    //it is a terminal operation
    //takes two arguments -1) default or initial value...2) BinaryOperator<T>


    public static int performMultiplication(List<Integer> list){
      return   list.stream()
                .reduce(1, (a,b) -> a*b);
    }

     public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> list){
        return   list.stream()
                .reduce( (a,b) -> a*b);
    }

    public static Optional<Student> highestGPA(){

        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> {
                    if (s1.getGpa()>s2.getGpa()){
                        return s1;
                } else{
                        return s2;
                    }
                });
    }


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,5,7);

        System.out.println(performMultiplication(list));

        Optional<Integer> result = performMultiplicationWithoutIdentity(list);
        System.out.println(result.isPresent());
        System.out.println(result.get());


        System.out.println(highestGPA().get());

    }
}
