package Instruction5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class {
    private String groupName;
    private int maxStudents;
    private List studentsList = new ArrayList<Student>();
    public Class(String groupName, int maxStudents) {
        this.groupName = groupName;
        this.maxStudents = maxStudents;
    }

    void addStudent(Student student){
        Iterator<Student> i = this.studentsList.iterator();
        while (i.hasNext()) {
            Student temp = i.next();
            if (temp.getName().compareTo(student.getName()) == 0 && temp.compare(student) == 0)
                return;
        }
        if(this.studentsList.size() <this.maxStudents)
            this.studentsList.add(student);
        else{
            System.err.println("group size exceeded");
        }
    }

    void setPoints(Student student, double pkt){
        student.setPoints(pkt);
    }

    void getStudent(Student student){
        if (student.getPoints() == 0){
            studentsList.remove(student);
        }
    }
    void changeCondition(Student student, StudentCondition condition){
        student.setCondition(condition);
    }
    List<Student> search(String lastName){
        List searchResult = new ArrayList<Student>();
        Iterator<Student> i = this.studentsList.iterator();
        while (i.hasNext()) {
            Student temp = i.next();
            if (temp.getSurname().compareTo(lastName) == 0)
                searchResult.add(temp);
        }
        return searchResult;
    }

    List<Student> searchPartial(String fragment){
        List searchResult = new ArrayList<Student>();
        Iterator<Student> i = this.studentsList.iterator();
        while (i.hasNext()) {
            Student temp = i.next();
            if ((temp.getName().indexOf(fragment) !=-1? true: false) || (temp.getSurname().indexOf(fragment) !=-1? true: false))
                searchResult.add(temp);
        }
        return searchResult;
    }

    int countByCondition(StudentCondition condition){
        int counter = 0;
        Iterator<Student> i = studentsList.iterator();
        while (i.hasNext()) {
            if(i.next().getCondition() == condition)
                counter++;
        }
        return counter;
    }

    void summary(){
        Iterator<Student> i = this.studentsList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

    List<Student> sortByName(){
        List<Student> sortedList = this.studentsList;
        sortedList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        return sortedList;
    }

    List<Student> sortByPoints(){
        List<Student> sortedList = this.studentsList;
        sortedList.sort((s1, s2) -> (Double.compare(s2.getPoints(), s1.getPoints())));
        return sortedList;
    }

    Student max(){
        Student Max = this.sortByPoints().get(0);
        return Max;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public List getStudentsList() {
        return studentsList;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    @Override
    public String toString() {
        return "Class{" +
                "groupName='" + groupName + '\'' +
                ", maxStudents=" + maxStudents +
                ", studentsList=" + studentsList +
                '}';
    }

}
