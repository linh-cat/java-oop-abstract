import model.Staff;
import model.StaffFullTime;

public class App {
    public static void main(String[] args) throws Exception {
        Staff staff = new StaffFullTime();
        staff.InputStaff();
        staff.CalculaSalary();
    }
}
