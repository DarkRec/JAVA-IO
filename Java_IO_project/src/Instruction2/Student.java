package Instruction2;
public class Student implements Comparable{
    private String name, surname, subject;
    private StudentCondition condition;
    private double points;

    public Student(String name, String surname, StudentCondition condition) {
        this.name = name;
        this.surname = surname;
        this.condition = condition;
        this.points = 0;
    }
    public Student(String name, String surname, StudentCondition condition, double points) {
        this.name = name;
        this.surname = surname;
        this.condition = condition;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", subject='" + subject + '\'' +
                ", condition=" + condition +
                ", points=" + points +
                '}';

    }

    @Override
    public int compare(Student s) {
        return this.surname.compareTo(s.getSurname());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void setPoints(double points) {
        this.points = points;
    }
    public double getPoints() {
        return points;
    }

    public StudentCondition getCondition() {
        return condition;
    }

    public void setCondition(StudentCondition condition) {
        this.condition = condition;
    }
}
