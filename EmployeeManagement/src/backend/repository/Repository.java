package backend.repository;


import entity.*;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Employee> employees;
    private List<Experience> experiences;
    private List<Fresher> freshers;
    private List<Intern> interns;

    public Repository(){
        employees = new ArrayList<>();
        experiences = new ArrayList<>();
        freshers = new ArrayList<>();
        interns = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public List<Fresher> getFreshers() {
        return freshers;
    }

    public void setFreshers(List<Fresher> freshers) {
        this.freshers = freshers;
    }

    public List<Intern> getInterns() {
        return interns;
    }

    public void setInterns(List<Intern> interns) {
        this.interns = interns;
    }





}
