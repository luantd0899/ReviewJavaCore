package entity;

import handlingexception.HandlingException;

import java.util.Date;

public class Certificate {
    private static int count = 0;
    private int id;
    private String certificateName;
    private String certificateRank;
    private Date certificateDate;

    public Certificate() {
        this.id = ++count;
    }

    public Certificate(String certificateName, String certificateRank, String certificateDate) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public Date getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(Date certificateDate) {
        this.certificateDate = certificateDate;
    }
    public void inputCertificate(){
        System.out.println("ID: " + id);
        System.out.println("CertificateName: ");
        this.certificateName = HandlingException.inputString("Ban da nhap sai, moi nhap lai!");

        System.out.println("CertificateRank");
        this.certificateRank = HandlingException.inputString("Ban da nhap sai, moi nhap lai!");

        System.out.println("CertificateDate: ");
        this.certificateDate = HandlingException.inputBirthDay();
    }

    public void outputCertificate(){
        System.out.println("ID: " + id);
        System.out.println("CertificateName: " + this.certificateName);

        System.out.println("CertificateRank" + this.certificateRank);

        System.out.println("CertificateDate: " + this.certificateDate);
    }
}
