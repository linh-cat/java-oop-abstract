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
        System.out.println("Nhập số  lượng nhân viên toàn thời gian: ");
        quantityStaffFullTime = scanner.nextInt();
        System.out.println("== Nhập thông tin nhân viên toàn thời gian ==");
        for (int i = 0; i < quantityStaffFullTime; i++) {
            System.out.println("Nhân viên thứ " + (i + 1));
            staff = new StaffFullTime();
            staff.InputStaff();
            ArrayList.add(staff);
        }
        System.out.println("Nhập số lượng nhân viên thời vụ: ");
        quantityStaffPartTime = scanner.nextInt();
        System.out.println("== Nhập thông tin nhân viên thời vụ ==");

        for (int i = 0; i < quantityStaffPartTime; i++) {
            System.out.println("Nhân viên thứ: " + (i + 1));
            staff = new StaffPartTime();
            staff.InputStaff();
            ArrayList.add(staff);
        }
        System.out.println("== Tất cả thông tin thu thập được ==");
        for (Staff staffValue : ArrayList) {
            staffValue.CalculaSalary();
            System.out.println(staffValue.toString());
        }
    }
}
