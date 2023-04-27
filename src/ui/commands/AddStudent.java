package ui.commands;

import ui.Console;
import ui.View;

public class AddStudent implements Command {
    private View view;

    public AddStudent(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Добавить студента";
    }

    @Override
    public void execute() {
        view.addStudent();
    }

}
