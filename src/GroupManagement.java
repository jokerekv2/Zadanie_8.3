import java.util.Scanner;

public class GroupManagement {
    private Scanner sc = new Scanner(System.in);

    public Student[] createStudents(int size) {
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Podaj imię, nazwisko oraz index studenta: ");
            students[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }
        return students;
    }

}
