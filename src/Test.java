public class Test {
    public static void main(String[] args) {
        WorkGroup group = new WorkGroup(new Teacher("Jan", "Kowalski", "Master's Degree"), new Student[3]);
        group.addStudentsToGroup();
        group.printGroupInfo();
    }
}
