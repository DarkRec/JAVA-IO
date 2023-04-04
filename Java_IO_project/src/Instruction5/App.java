package Instruction5;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;

public class App {

    public static ClassContainer dziennik = new ClassContainer();

    public Class currentClass = null;
    private JButton addStudent;
    private JPanel mainPanel;
    private JList groupsList;
    private JList studentsList;
    private JTextField name;
    private JTextField surName;
    private JTextField status;
    private JButton addGroup;
    private JTextField groupName;
    private JTextField groupMax;
    private JButton reload;
    private JButton delGroup;
    private JButton emptyGroups;
    private JButton summaryGroups;
    private JButton editPoints;
    private JTextField pointsField;
    private JButton searchButton;
    private JTextField searchField;
    private JButton sortName;
    private JButton sortPoints;
    private JButton maxPunktowButton;
    private JButton editGroupMax;

    public App() {
        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentClass!=null){
                    StudentCondition condition = StudentCondition.OBECNY;
                    if (status.getText().equals("NIEOBECNY"))
                        condition = StudentCondition.NIEOBECNY;
                    else if (status.getText().equals("ODRABIAJACY")){
                        condition = StudentCondition.ODRABIAJACY;
                    }else if (status.getText().equals("CHORY")){
                        condition = StudentCondition.CHORY;
                    }

                    Student newStudent = new Student(name.getText(), surName.getText(), condition);
                    currentClass.addStudent(newStudent);
                    loadStudent(currentClass.getGroupName());
                }
            }
        });
        addGroup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel l1 = new DefaultListModel();
                try {
                    dziennik.addClass(groupName.getText(),Integer.parseInt(groupMax.getText()));
                } catch (final NumberFormatException exception) {
                }
                reload();
            }
        });
        reload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reload();
            }
        });
        groupsList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JList list = (JList)e.getSource();
                int index = list.locationToIndex(e.getPoint());
                if (index >=0){
                    Object o = list.getModel().getElementAt(index);
                    loadStudent(o.toString());
                }
            }
        });
        delGroup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!groupsList.isSelectionEmpty())
                    dziennik.removeClass(groupsList.getSelectedValue().toString());
                reload();
            }
        });
        emptyGroups.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                renderGroups(dziennik.findEmpty());
            }
        });
        summaryGroups.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                renderGroups(dziennik.summary());
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentClass!=null)
                    renderStudents(currentClass.searchPartial(searchField.getText()));
                    //renderStudents(currentClass.search(searchField.getText()));
            }
        });
        sortName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentClass!=null)
                    renderStudents(currentClass.sortByName());
            }
        });
        sortPoints.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentClass!=null)
                    renderStudents(currentClass.sortByPoints());
            }
        });
        editPoints.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentClass!=null && !studentsList.isSelectionEmpty() && !pointsField.getText().equals("")) {
                    String[] student = studentsList.getSelectedValue().toString().split(" ");
                    currentClass.searchPartial(student[0]).forEach(stud1->{
                        currentClass.searchPartial(student[1]).forEach(stud2->{
                            if(stud1.compare(stud2)==0) {
                                try {
                                    currentClass.setPoints(stud1, Integer.parseInt(pointsField.getText()));
                                } catch (final NumberFormatException exception) {
                                }
                            }
                        });
                    });
                    loadStudent(currentClass.getGroupName());
                }
            }
        });
        maxPunktowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentClass!=null) {
                    DefaultListModel stud= new DefaultListModel();
                    stud.addElement(currentClass.max());
                    studentsList.setModel(stud);
                }
            }
        });
        editGroupMax.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentClass!=null && !groupMax.getText().equals("")){
                    try {
                        currentClass.setMaxStudents(Integer.parseInt(groupMax.getText()));
                    } catch (final NumberFormatException exception) {
                    }
                }
            }
        });
        searchField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == 10)
                    if (currentClass!=null)
                        renderStudents(currentClass.searchPartial(searchField.getText()));
            }
        });
    }

    public void renderStudents(List<Student> list){
        DefaultListModel defList = new DefaultListModel();
        list.forEach(student->{
            defList.addElement(student);
        });
        studentsList.setModel(defList);
    }

    public void renderGroups(List<String> list){
        DefaultListModel defList = new DefaultListModel();
        list.forEach((name)->{
            defList.addElement(name);
        });
        groupsList.setModel(defList );
    }


    public void loadStudent(String gName){
        DefaultListModel list = new DefaultListModel();
        dziennik.getClassMap().forEach((name,klasa)->{
            if(name.equals(gName)){
                currentClass = klasa;
                klasa.getStudentsList().forEach(student->{
                    list.addElement(student);
                });
            }
        });
        studentsList.setModel(list);
    }

    public void reload(){
        DefaultListModel list = new DefaultListModel();
        dziennik.getClassMap().forEach((name,klasa)->{
            list.addElement(klasa.getGroupName());
        });
        groupsList.setModel(list);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().mainPanel);


        System.out.println("Hello world!");
        dziennik.addClass("klasa",5);
        dziennik.addClass("klasa2",10);

        Class klasa = dziennik.classMap.get("klasa");
        Student s1 = new Student("Jakub", "Litewka", StudentCondition.OBECNY ,6 );
        Student s2 = new Student("Robert", "Lewandowski", StudentCondition.NIEOBECNY ,1 );
        Student s3 = new Student("Adam", "Małysz", StudentCondition.NIEOBECNY );
        klasa.addStudent(s1);
        klasa.addStudent(s2);
        klasa.addStudent(s3);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
