package model;

import java.util.Scanner;

public class StaffFullTime extends Staff {

    private int numberWorkDay, choose;
    private String typeStaff;
    private static Scanner input = new Scanner(System.in);

    private static long salarySir = 20000000;
    private static long salaryNormal = 10000000;
    private static long salaryAddTime = 8000000;

    public StaffFullTime() {
        super();
    }

    public StaffFullTime(int numberWorkDay, String typeStaff) {
        super();
        this.numberWorkDay = numberWorkDay;
        this.typeStaff = typeStaff;
    }

    public int getNumberWorkDay() {
        return numberWorkDay;
    }

    public void setNumberWorkDay(int numberWorkDay) {
        this.numberWorkDay = numberWorkDay;
    }

    public String getTypeStaff() {
        return typeStaff;
    }

    public void InputStaff() {
        // TODO Auto-generated method stub
        super.InputStaff();

        System.out.println("Chức vụ(1 - bình thường, 2 - sếp): ");
        choose = input.nextInt();

        System.out.println("Nhập số giờ làm thêm: ");
        numberWorkDay = input.nextInt();

        switch (choose) {
            case 1:
                typeStaff = "Nhân viên bình thường!";
                break;
            case 2:
                typeStaff = "Nhân viên sếps!";
                break;

            default:
                System.out.println("Nhập sai chức vụ nhân viên @@");
                break;
        }
    }

    @Override
    public void CalculaSalary() {
        // TODO Auto-generated method stub
        if (typeStaff.equals("Nhân viên bình thường!")) {
            employeeSalary = salaryNormal + numberWorkDay * salaryAddTime;
        } else if (typeStaff.equals("Nhân viên sếps!")) {
            employeeSalary = salarySir + numberWorkDay * salaryAddTime;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", Loại Nhân Viên: " + this.typeStaff + " Số ngày làm việc: " + this.numberWorkDay;
    }

}
