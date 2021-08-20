package backend.service;

import entity.Employee;
import entity.Experience;

import java.util.List;

public interface IEmployeeService {
    void getAllEmployees();
    void addEmployee();
    void updateEmployeeById(int id);
    void deleteEmployeeId(int id);
    void getAllInterns();
    void getAllFreshers();
    void getAllExperiences();

}
