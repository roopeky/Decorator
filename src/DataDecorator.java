import java.util.Scanner;

public class DataDecorator implements DataStructure {
    private DataStructure ds;
    private String password;

    public DataDecorator(DataStructure ds, String password) {
        this.ds = ds;
        this.password = password;
    }

    @Override
    public void processData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");

        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(password)) {
            ds.processData();
        } else {
            System.out.println("Access denied! Wrong password entered.");
        }
    }
}
