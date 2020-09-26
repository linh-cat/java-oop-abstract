import java.util.Scanner;

import model.Staff;
import model.StaffFullTime;
import model.StaffPartTime;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int quantityStaffFullTime, quantityStaffPartTime;

        Scanner scanner = new Scanner(System.in);
        Staff staff;

        ArrayList<Staff> ArrayList = new ArrayList<Staff>();
        System.out.println("Nhap so luong nhan vien toan thoi gian: ");
        quantityStaffFullTime = scanner.nextInt();
        System.out.println("== Nhap thong tin nhan vien toan thoi gian ==");
        for (int i = 0; i < quantityStaffFullTime; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1));
            staff = new StaffFullTime();
            staff.InputStaff();
            ArrayList.add(staff);
        }
        System.out.println("Nhap so luong nhan vien thoi vu: ");
        quantityStaffPartTime = scanner.nextInt();
        System.out.println("== Nhap thong tin nhan vien thoi vu ==");

        for (int i = 0; i < quantityStaffPartTime; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1));
            staff = new StaffPartTime();
            staff.InputStaff();
            ArrayList.add(staff);
        }
        System.out.println("Thong Tin Ve Luong");
        for (Staff staffValue : ArrayList) {
            staffValue.CalculaSalary();
            System.out.println(staffValue.toString());
        }
    }
}
