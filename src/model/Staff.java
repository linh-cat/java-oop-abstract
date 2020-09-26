package model;

import java.util.Scanner;

public abstract class Staff {
    private String nameStaff;
    protected long employeeSalary;

    Scanner scanner = new Scanner(System.in);

    public void Staff(String nameStaff, long employeeSalary) {
        this.nameStaff = nameStaff;
        this.employeeSalary = employeeSalary;
    }

    public String getName() {
        return nameStaff;
    }

    public long getEmloyeeSalaary() {
        return employeeSalary;
    }

    public void InputStaff() {
        System.out.println("Nhập vào tên nhân viên: ");
        nameStaff = scanner.nextLine();
    }

    public abstract void CalculaSalary();

    @Override
    public String toString() {
        return "Tên: " + this.getName() + ", Lương: " + this.getEmloyeeSalaary() + "VND.";
    }
}
