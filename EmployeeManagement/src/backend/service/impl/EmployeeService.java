package backend.service.impl;

import backend.repository.Repository;
import backend.service.IEmployeeService;
import entity.Employee;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import handlingexception.HandlingException;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {

    private Employee employee;


    @Override
    public void getAllEmployees() {
        for (Employee e : Repository.employees) {
            e.output();
        }
    }

    @Override
    public void addEmployee() {
        System.out.println("Ban muon them Employee nao: 1- Intern, 2- Fresher, 3- Experience");
        int choose = HandlingException.inputInt("Ban da nhap sai, moi nhap lai!");
        switch (choose){
            case 1:

                employee = new Intern();
                ((Intern) employee).inputIntern();
                Repository.employees.add(employee);
                break;

            case 2:
                employee = new Fresher();
                ((Fresher) employee).inputFresher();
                Repository.employees.add(employee);
                break;

            case 3:
                employee = new Experience();
                ((Experience) employee).inputExperience();
                Repository.employees.add(employee);
                break;

            default:
                System.out.println("Ban da nhap sai, moi nhap lai!");
                break;
        }
    }

    @Override
    public void updateEmployeeById(int id ) {
        if (isEmployeeExsist(id)){
            Employee newEmployee = null;

            employee = findEmployeeById(id);
            if (employee instanceof Intern){
                    newEmployee = new Intern();
                    ((Intern) newEmployee).inputIntern();
                    ((Intern) employee).setFullName(newEmployee.getFullName());
                    ((Intern) employee).setBirthday(newEmployee.getBirthday());
                    ((Intern) employee).setEmail(newEmployee.getEmail());
                    ((Intern) employee).setPhone(newEmployee.getPhone());
                    ((Intern) employee).setCertificates(newEmployee.getCertificates());
                    ((Intern) employee).setMajors(((Intern) newEmployee).getMajors());
                    ((Intern) employee).setUniversityName(((Intern) newEmployee).getUniversityName());
            }else if (employee instanceof Fresher) {

                newEmployee = new Fresher();
                ((Fresher) newEmployee).inputFresher();
                ((Fresher) employee).setFullName(newEmployee.getFullName());
                ((Fresher) employee).setBirthday(newEmployee.getBirthday());
                ((Fresher) employee).setEmail(newEmployee.getEmail());
                ((Fresher) employee).setPhone(newEmployee.getPhone());
                ((Fresher) employee).setCertificates(newEmployee.getCertificates());
                ((Fresher) employee).setGraduationDate(((Fresher) newEmployee).getGraduationDate());
                ((Fresher) employee).setGraduationRank(((Fresher) newEmployee).getGraduationRank());
                ((Fresher) employee).setSchoolName(((Fresher) newEmployee).getSchoolName());
            }else if (employee instanceof Experience) {

                newEmployee = new Experience();
                ((Experience) newEmployee).inputExperience();
                ((Experience) employee).setFullName(newEmployee.getFullName());
                ((Experience) employee).setBirthday(newEmployee.getBirthday());
                ((Experience) employee).setEmail(newEmployee.getEmail());
                ((Experience) employee).setPhone(newEmployee.getPhone());
                ((Experience) employee).setCertificates(newEmployee.getCertificates());
                ((Experience) employee).setExpInYear(((Experience) newEmployee).getExpInYear());
                ((Experience) employee).setProSkill(((Experience) newEmployee).getProSkill());
            }


        }else {
            System.err.println("User is not exsist!!");
        }
    }

    @Override
    public void deleteEmployeeId(int id) {
        if (isEmployeeExsist(id)){
            for (Employee e : Repository.employees) {
                if (e.getId() == id){
                    Repository.employees.remove(e);
                }
            }
        }else{
            System.err.println("User is not exsist!!!");
        }
    }

    @Override
    public void getAllInterns() {
        for (Employee e : Repository.employees) {
            if (e instanceof Intern){
                e.showMe();
            }
        }
    }

    @Override
    public void getAllFreshers() {
        for (Employee e : Repository.employees) {
            if (e instanceof Fresher){
                e.showMe();
            }
        }
    }

    @Override
    public void getAllExperiences() {
        for (Employee e : Repository.employees) {
            if (e instanceof Experience){
                e.showMe();
            }
        }
    }

    private boolean isEmployeeExsist(int id){
        for (Employee e :
                Repository.employees) {
            if (e.getId() == id){
                return true;
            }
        }
        return false;
    }

    private Employee findEmployeeById(int id){
        Employee employee = null;
        for (Employee e : Repository.employees) {
            if (e.getId() == id){
                employee = e;
                break;
            }
        }
        return employee;
    }




}
