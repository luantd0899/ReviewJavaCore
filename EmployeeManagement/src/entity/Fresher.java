package entity;

import handlingexception.HandlingException;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Fresher extends Employee {

    private Date graduationDate;
    private String graduationRank;
    private String schoolName;

    public Fresher(){

    }

    public Fresher(String fullName, Date birthday, int phone, String email, int employeeType, int employeeCount, List<Certificate> certificates, Date graduationDate, String graduationRank, String schoolName) {
        super(fullName, birthday, phone, email, employeeType, employeeCount, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.schoolName = schoolName;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void inputFresher(){
        super.input();
        System.out.println("Nhap GraduationDate: ");
        this.graduationDate = HandlingException.inputBirthDay();
        System.out.println("Nhap GraduationRank: ");
        this.graduationRank = HandlingException.inputString("Ban da nhap sai, moi nhap lai!");

        System.out.println("Nhap School Name: ");
        this.schoolName = HandlingException.inputString("Ban da nhap sai, moi nhap lai!");
    }

    @Override
    public void showMe() {
        super.output();

        System.out.println("GraduationDate" + this.graduationDate);
        System.out.println("GraduationRank: " + this.graduationRank);
        System.out.println("SchoolName: " + this.schoolName);
    }
}
