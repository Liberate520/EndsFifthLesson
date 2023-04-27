package ui;

import presenter.Presenter;

public interface View {
    void print(String text);
    void start();
    void setPresenter(Presenter presenter);

    void addStudent();
    void getStudentList();
    void finish();
}
