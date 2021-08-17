package entity;

import handlingexception.HandlingException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Employee {
    private static int count = 0;
    private int id;
    private String fullName;
    private Date birthday;
    private int phone;
    private String email;
    private int employeeType;
    private int employeeCount;
    private List<Certificate> certificates = new ArrayList<>();

    public Employee(String fullName, Date birthday, int phone, String email, int employeeType, int employeeCount, List<Certificate> certificates) {
        count++;
        this.id = count;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        this.employeeCount = employeeCount;
        this.certificates = certificates;
    }

    public Employee() {
        this.id = ++count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }



    public void input(){
        System.out.println("ID: " + this.id);
        System.out.println("Nhap fullName: ");
        this.fullName = HandlingException.inputName();

        System.out.println("Nhap BirdthDay: ");
        this.birthday = HandlingException.inputBirthDay();

        System.out.println("Nhap Phone: ");
        this.phone = HandlingException.inputInt("Ban da nhap sai, moi nhap lai");

        System.out.println("Nhap email: ");
        this.email = HandlingException.inputEmail();

        System.out.println("Thong tin bang cap: ");
        System.out.println("Nhap so luong bang cap: ");
        int bangCap = HandlingException.inputInt("Ban da nhap sai, moi nhap lai!");
        for(int i = 0; i< bangCap; i++){
            System.out.println("Nhap thong tin bang cap thu: " + (i+1));
            Certificate certificate = new Certificate();
            certificate.inputCertificate();
            certificates.add(certificate);
        }
    }

    public void output(){
        System.out.println("====================================");
        System.out.println("ID: " + this.id);
        System.out.println("FullName: " + this.fullName);
        System.out.println("BirthDay: " + this.birthday);
        System.out.println("Email: " + this.email);
        System.out.println("==Certificate==");
        for (Certificate c :
                certificates) {
            c.outputCertificate();
        }
    }


    public abstract void showMe();
}
