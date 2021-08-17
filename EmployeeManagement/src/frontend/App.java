package frontend;

import backend.controller.EmployeeController;
import handlingexception.HandlingException;



public class App {

    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();
        System.out.println("==================Employee Management==================");
        menu();
        while (true){
            System.out.println("Moi ban chon: ");
            int choose = HandlingException.inputInt("Ban da nhap sai, moi nhap lai!");

            switch (choose){
                case 1:
                    System.out.println("Them nhan vien");
                    controller.addEmployee();
                    break;

                case 2:
                    System.out.println("Sua nhan vien");
                    System.out.println("Nhap id cua nhan vien can update: ");
                    int idUpdate = HandlingException.inputInt("Ban da nhap sai, moi nhap lai!");
                    controller.updateEmployee(idUpdate);
                    break;

                case 3:
                    System.out.println("Xoa nhan vien");
                    System.out.println("Nhap id nhan vien can xoa: ");
                    int id = HandlingException.inputInt("Ban da nhap sai, moi nhap lai!");
                    controller.deleteEmployeeById(id);
                    break;

                case 4:
                    System.out.println("Tim nhan vien Intern");
                    controller.getAllInterns();
                    break;

                case 5:
                    System.out.println("Tim nhan vien Fresher");
                    controller.getAllFreshers();
                    break;

                case 6:
                    System.out.println("Tim nhan vien Experience");
                    controller.getAllExperience();
                    break;

                case 7:
                    System.out.println("Get All Employee");
                    controller.getAllEmployees();
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    return;

                default:
                    System.out.println("Ban da nhap sai, moi nhap lai!");
                    break;
            }
        }

    }

    private static void menu(){
        System.out.println("1. Them nhan vien");
        System.out.println("2. Sua nhan vien");
        System.out.println("3. Xoa nhan vien");
        System.out.println("4. Tim nhan vien Intern");
        System.out.println("5. Tim nhan vien Fresher");
        System.out.println("6. Tim nhan vien Experience");
        System.out.println("7. Get all employee");
        System.out.println("0. Thoat chuong trinh!");
    }

}
