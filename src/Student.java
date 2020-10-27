public class Student extends Person {
    private int index;

    public Student(String name, String surname, int index) {
        super(name, surname);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + index;
    }
}
