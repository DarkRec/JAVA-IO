package Instruction5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClassContainer {
    HashMap<String, Class> classMap = new HashMap<String, Class>();
    void addClass(String name, int size){
        classMap.put(name, new Class(name, size));
    }

    void removeClass(String name){
        classMap.remove(name);
    }

    void editClass(String name, int num){
        classMap.get(name).setMaxStudents(num);
    }
    List<String> findEmpty(){
        List<String> emptyList = new ArrayList<String>();
        for (String name: classMap.keySet()) {
            if (classMap.get(name).getStudentsList().size()==0)
                emptyList.add(classMap.get(name).getGroupName());
        }
        return emptyList;
    }


    List<String> summary(){
        List<String> summaryList = new ArrayList<String>();
        for (String name: classMap.keySet()){
            double percent = classMap.get(name).getStudentsList().size()*100/classMap.get(name).getMaxStudents();
            summaryList.add(classMap.get(name).getGroupName()+"   "+percent+"%");
        }
        return summaryList;
    }

    public HashMap<String, Class> getClassMap() {
        return classMap;
    }


}
