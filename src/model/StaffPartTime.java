package model;

import java.util.Scanner;

public class StaffPartTime extends Staff {
    private int timeWork;
    private static long salaryStaffPartTime = 100000;
    private static Scanner input = new Scanner(System.in);

    public StaffPartTime() {
        super();
    }

    public StaffPartTime(int timeWork) {
        super();
        this.timeWork = timeWork;
    }

    @Override
    public void InputStaff() {
        // TODO Auto-generated method stub
        super.InputStaff();
        System.out.println("Nhập số giờ làm việc: ");
        timeWork = input.nextInt();

    }

    @Override
    public void CalculaSalary() {
        // TODO Auto-generated method stub
        employeeSalary = salaryStaffPartTime * this.timeWork;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", Giờ làm việc: " + this.timeWork;
    }
}
