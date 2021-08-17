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

    private List<Employee> employees;
    private Employee employee;

    public EmployeeService(){
        employees = new ArrayList<>();
    }

    @Override
    public void getAllEmployees() {
        for (Employee e : employees) {
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
                employees.add(employee);
                break;

            case 2:
                employee = new Fresher();
                ((Fresher) employee).inputFresher();
                employees.add(employee);
                break;

            case 3:
                employee = new Experience();
                ((Experience) employee).inputExperience();
                employees.add(employee);
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
            System.out.println("Ban muon update employee nao: 1- Intern, 2- Fresher, 3- Experience");
            int choose= HandlingException.inputInt("Ban da nhap sai, moi nhap lai!");
            switch (choose){
                case 1:

                    newEmployee = new Intern();
                    ((Intern) newEmployee).inputIntern();
                    ((Intern) employee).setFullName(newEmployee.getFullName());
                    ((Intern) employee).setBirthday(newEmployee.getBirthday());
                    ((Intern) employee).setEmail(newEmployee.getEmail());
                    ((Intern) employee).setPhone(newEmployee.getPhone());
                    ((Intern) employee).setCertificates(newEmployee.getCertificates());
                    ((Intern) employee).setMajors(((Intern) newEmployee).getMajors());
                    ((Intern) employee).setUniversityName(((Intern) newEmployee).getUniversityName());
                    break;

                case 2:
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
                    break;

                case 3:
                    newEmployee = new Experience();
                    ((Experience) newEmployee).inputExperience();
                    ((Experience) employee).setFullName(newEmployee.getFullName());
                    ((Experience) employee).setBirthday(newEmployee.getBirthday());
                    ((Experience) employee).setEmail(newEmployee.getEmail());
                    ((Experience) employee).setPhone(newEmployee.getPhone());
                    ((Experience) employee).setCertificates(newEmployee.getCertificates());
                    ((Experience) employee).setExpInYear(((Experience) newEmployee).getExpInYear());
                    ((Experience) employee).setProSkill(((Experience) newEmployee).getProSkill());
                    break;

                default:
                    System.out.println("Ban da nhap sai, moi nhap lai!");
                    break;
            }
        }else {
            System.err.println("User is not exsist!!");
        }
    }

    @Override
    public void deleteEmployeeId(int id) {
        if (isEmployeeExsist(id)){
            for (Employee e : employees) {
                if (e.getId() == id){
                    employees.remove(e);
                }
            }
        }else{
            System.err.println("User is not exsist!!!");
        }
    }

    @Override
    public void getAllInterns() {
        for (Employee e : employees) {
            if (e instanceof Intern){
                e.showMe();
            }
        }
    }

    @Override
    public void getAllFreshers() {
        for (Employee e : employees) {
            if (e instanceof Fresher){
                e.showMe();
            }
        }
    }

    @Override
    public void getAllExperiences() {
        for (Employee e : employees) {
            if (e instanceof Experience){
                e.showMe();
            }
        }
    }

    private boolean isEmployeeExsist(int id){
        for (Employee e :
                employees) {
            if (e.getId() == id){
                return true;
            }
        }
        return false;
    }




}
