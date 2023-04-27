package presenter;

import model.Service;
import ui.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addStudent(String firstName, String lastName){
        service.addStudent(firstName, lastName);
    }

    public void getStudentList(){
        view.print(service.getStudentList());
    }
}
