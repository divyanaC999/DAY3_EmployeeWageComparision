
public class EmployeeWageUC2 {

		public static void main(String[] args) {
			int IS_PRESENT = 1;
			int SALARY_PER_HOUR = 20;
			double empCheck = Math.floor(Math.random() * 10) % 2;
			int workingHour = 0;
			System.out.println(empCheck);

			if (empCheck == IS_PRESENT) {
				workingHour = 8;
			}
			double empSalary = workingHour * SALARY_PER_HOUR;

			System.out.println("Employee has earned " + empSalary + " dollar toaday");
		}
	}