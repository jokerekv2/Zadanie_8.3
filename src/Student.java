public class Student extends Person {
    private int index;
    private final static int MAX_NUMBER_OF_MARKS = 10;
    private int[] mark = new int[MAX_NUMBER_OF_MARKS];


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

    public int[] getMark() {
        return mark;
    }

    public void setMark(int[] mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + index;
    }
}
