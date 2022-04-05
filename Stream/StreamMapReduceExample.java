package Stream;

import StudentPkg.StudentDataBase;

public class StreamMapReduceExample {


    public static int numberOfNotebooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGradeLevel()>=3)
                .map((s) -> s.getNotebooks())
              //  .reduce(0, (n1,n2) -> n1+n2);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println(numberOfNotebooks());

    }
}
