public class Teacher extends Person {
    private String degree;

    public Teacher(String name, String surname, String degree) {
        super(name, surname);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + degree;
    }
}
