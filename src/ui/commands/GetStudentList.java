package ui.commands;

import ui.Console;
import ui.View;

public class GetStudentList implements Command {
    private View view;

    public GetStudentList(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Получить список студентов";
    }

    @Override
    public void execute() {
        view.getStudentList();
    }
}
