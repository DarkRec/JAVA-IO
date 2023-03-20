package Instruction2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassContainer {
    HashMap<String, Class> classMap = new HashMap<String, Class>();
    void addClass(String name, int size){
        classMap.put(name, new Class(name, size));
    }

    void removeClass(String name){
        classMap.remove(name);
    }

    List<String> findEmpty(){
        List<String> emptyList = new ArrayList<String>();
        for (String name: classMap.keySet()) {
            if (classMap.get(name).getStudentsList().size()==0)
                emptyList.add(classMap.get(name).getGroupName());
        }
        return emptyList;
    }

    void summary(){
        for (String name: classMap.keySet()){
            double percent = classMap.get(name).getStudentsList().size()*100/classMap.get(name).getMaxStudents();
            System.out.println(classMap.get(name).getGroupName()+"   "+percent+"%");
        }
    }
}
