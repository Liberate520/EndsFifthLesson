package model;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<String> list;

    public Service() {
        list = new ArrayList<>();
        list.add("Иван Петрович");
        list.add("Петр Смирнов");
        list.add("Александр Пушкин");
    }

    public void addStudent(String firstName, String lastName){
        list.add(firstName + " " + lastName);
    }

    public String getStudentList(){
        return list.toString();
    }
}
