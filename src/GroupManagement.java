import java.util.Scanner;

public class GroupManagement {
    private Scanner sc = new Scanner(System.in);

    public Student[] addStudentsToGroup(WorkGroup workGroup) {
        Student[] students = workGroup.getStudents();
        for (int i = 0; i < workGroup.getStudents().length; i++) {
            System.out.println("Podaj imię, nazwisko oraz index studenta: ");
            students[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }
        return students;
    }

    public void printGroupInfo(WorkGroup group) {
        Student[] students = group.getStudents();
        System.out.println("Prowadzący: " + group.getTeacher().getName() + " " + group.getTeacher().getSurname() +
                " | " + group.getTeacher().getDegree());
        System.out.println("Lista zapisanych studentów:");
        for (int i = 0; i < group.getStudents().length; i++) {
            System.out.println(students[i].getName() + " " + students[i].getSurname() + " " + students[i].getIndex());
        }

    }
}
