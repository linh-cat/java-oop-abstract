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
        System.out.println("Nhap so gio lam them: ");
        numberWorkDay = input.nextInt();
        System.out.println("Nhap chuc vu cua nhan vien: ");
        choose = input.nextInt();

        switch (choose) {
            case 1:
                typeStaff = "Nhan Vien Binh Thuong!";
                break;
            case 2:
                typeStaff = "Nhan Vien Cap Ca!";
                break;

            default:
                System.out.println("Nhap Sai Loai Nhan Vien @@");
                break;
        }
    }

    @Override
    public void CalculaSalary() {
        // TODO Auto-generated method stub
        if (typeStaff.equals("Nhan Vien Binh Thuong!")) {
            employeeSalary = salaryNormal + numberWorkDay * salaryAddTime;
        } else if (typeStaff.equals("Nhan Vien Cap Ca!")) {
            employeeSalary = salarySir + numberWorkDay * salaryAddTime;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", Loai Nhan Vien: " + this.typeStaff + "So Gio Lam Viec: " + this.numberWorkDay;
    }

}
