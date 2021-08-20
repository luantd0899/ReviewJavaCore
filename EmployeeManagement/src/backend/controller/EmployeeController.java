package backend.controller;

import backend.service.IEmployeeService;
import backend.service.impl.EmployeeService;
import entity.Employee;

import java.util.List;

public class EmployeeController {
    private IEmployeeService employeeService;

    public EmployeeController(){
        employeeService = new EmployeeService();
    }

    public void getAllEmployees(){
        employeeService.getAllEmployees();
    }
    public void addEmployee(){
        employeeService.addEmployee();
    }

    public void updateEmployee(int id){
        employeeService.updateEmployeeById(id);
    }

    public void deleteEmployeeById(int id){
        employeeService.deleteEmployeeId(id);
    }

    public void getAllInterns(){
        employeeService.getAllInterns();
    }

    public void getAllFreshers(){
        employeeService.getAllFreshers();
    }

    public void getAllExperience(){
        employeeService.getAllExperiences();
    }
}
