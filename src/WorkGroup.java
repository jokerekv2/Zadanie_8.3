public class WorkGroup {
    private Teacher teacher;
    private Student[] students;
    private int size;

    private GroupManagement groupManagement = new GroupManagement();

    public WorkGroup(Teacher teacher, Student[] students) {
        this.teacher = teacher;
        this.students = students;
        size = students.length;
    }

    public void addStudentsToGroup() {
        System.out.println("Dopisz " + size + " studentów.");
        students = groupManagement.createStudents(size);
    }

    public void printGroupInfo() {
        System.out.println("Prowadzący: " + teacher.toString());
        System.out.println("Lista zapisanych studentów:");
        for (int i = 0; i < getStudents().length; i++) {
            System.out.println(students[i].toString());
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getSize() {
        return size;
    }
}
