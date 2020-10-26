public class Test {
    public static void main(String[] args) {
        GroupManagement groupManagement = new GroupManagement();

        WorkGroup group = new WorkGroup(new Teacher("Jan", "Kowalski", "Master's Degree"), new Student[3]);
        group.setStudents(groupManagement.addStudentsToGroup(group));
        groupManagement.printGroupInfo(group);

    }


}
