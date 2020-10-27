import java.util.Scanner;

public class Register {
    private Scanner sc = new Scanner(System.in);
    private Student student = new Student();

    public void addMark(int size){
        System.out.println("Ile ocen chcesz dodać?");
        int howManyMarks = sc.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < howManyMarks; i++) {
            marks[i] = sc.nextInt();
        }

    }

    public int whatStudent(){
        System.out.println("Dla którego studenta chcesz dodać oceny?");
        int whatStudent = sc.nextInt();
        return whatStudent;
    }
}
