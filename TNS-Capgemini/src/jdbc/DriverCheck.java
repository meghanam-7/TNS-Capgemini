package jdbc;

public class DriverCheck {
	public static void main(String[] args) {
		try {
			Class<?> driver = Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			System.out.println("Driver Name: " + driver.getName());
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
		}
	}
}