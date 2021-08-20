package handlingexception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HandlingException {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String message){
        while (true){
            try{
                return Integer.parseInt(scanner.nextLine().trim());
            }catch (Exception e){
                System.err.println(message);
            }
        }
    }

    public static String inputString(String message){
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.err.println(message);

            } else {
                return input;
            }
        }
    }

    public static String inputName() {
        while (true) {
            String fullName = inputString("Ten khong duoc de trong, moi ban nhap lai!!!").trim().replaceAll("\\s+", " ");
            String[] name = fullName.split(" ");
            int count = 0;
            String result = "";
            for (int i = 0; i < name.length; i++) {
                count++;
                result += String.valueOf(name[i].charAt(0)).toUpperCase() + name[i].substring(1) + " ";
            }
            if (count >= 2) {
                return result;
            } else {
                System.out.println("Ten cua ban phai co nhieu hon hai ki tu, moi nhap lai!!");
            }
        }

    }

    public static String inputEmployeeType(){
        while (true){
            String employeeType = inputString("Khong duoc de trong employeeType, moi ban nhap lai!").trim();
            if (employeeType.equalsIgnoreCase("Experience") || employeeType.equalsIgnoreCase("Fresher") || employeeType.equalsIgnoreCase("Intern")){
                return employeeType;
            }else {
                System.err.println("Ban phai nhap dung employeeType, moi nhap lai!");
            }
        }
    }

    public static String inputEmail(){
        while (true) {
            String email = inputString("Email khong duoc de trong, moi ban nhap lai!!!").trim();
            if (email.contains("@") && email.contains(".com") && email.length() >= 5) {
                return email;
            } else {
                System.err.println("Email phai chua ki tu '@', '.com' va do dai phai lon hon 5");
            }
        }
    }

    public static Date inputBirthDay() {
        while (true){
            String birdDay = inputString("BirdDay khong duoc de trong, moi ban nhap lai");
            String date = "^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-([12][0-9]{3})$";
            if(birdDay.matches(date)){
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

                try {
                    return simpleDateFormat.parse(birdDay);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }else {

                try {
                    throw new BirthDayException();
                } catch (BirthDayException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    
    


}
