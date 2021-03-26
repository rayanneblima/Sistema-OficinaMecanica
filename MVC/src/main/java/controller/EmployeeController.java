package controller;

import view.EmployeeForm;

public class EmployeeController {
    
    public void showView() {
        EmployeeForm employeeView = new EmployeeForm(this);
        employeeView.setVisible(true);
        employeeView.setLocationRelativeTo(null);
    }
}
