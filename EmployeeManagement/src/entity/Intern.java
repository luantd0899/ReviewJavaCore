package entity;

import handlingexception.HandlingException;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Intern extends Employee {

    private String majors;
    private String universityName;

    public Intern(){

    }

    public Intern(String fullName, Date birthday, int phone, String email, int employeeType, int employeeCount, List<Certificate> certificates, String majors, String universityName) {
        super(fullName, birthday, phone, email, employeeType, employeeCount, certificates);
        this.majors = majors;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }



    public void inputIntern(){
        super.input();
        System.out.println("Nhap Majors: ");
        this.majors = HandlingException.inputString("Ban da nhap sai, moi nhap lai!");

        System.out.println("Nhap UniversityName: ");
        this.universityName = HandlingException.inputString("Ban da nhap sai, moi nhap lai!");
    }

    @Override
    public void showMe() {
        super.output();

        System.out.println("Majors: " + this.majors);
        System.out.println("UniversityName: " + this.universityName);
    }
}
