package entity;

import handlingexception.HandlingException;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Experience extends Employee {

    private int expInYear;
    private String proSkill;

    public Experience(){

    }

    public Experience(String fullName, Date birthday, int phone, String email, int employeeType, int employeeCount, List<Certificate> certificates, int expInYear, String proSkill) {
        super(fullName, birthday, phone, email, employeeType, employeeCount, certificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public void inputExperience(){
        super.input();
        System.out.println("Nhap ExpInYear: ");
        this.expInYear = HandlingException.inputInt("Ban da nhap sai, moi nhap lai!");

        System.out.println("Nhap ProSkill: ");
        this.proSkill = HandlingException.inputString("Ban da nhap sai, moi nhap lai!");
    }

    @Override
    public void showMe() {
        super.output();
        System.out.println("ExpInYear: " + this.expInYear);
        System.out.println("ProSkill: " + this.proSkill);
    }
    

}
