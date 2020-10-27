public class Test {
    public static void main(String[] args) {
        WorkGroup group = new WorkGroup(new Teacher("Jan", "Kowalski", "Master's Degree"), new Student[2]);
        WorkGroup group1 = new WorkGroup(new Teacher("Kolega", "Ignacy", "Master's Degree"), new Student[2]);
        group.addStudentsToGroup();
        group.printGroupInfo();
    }
}
