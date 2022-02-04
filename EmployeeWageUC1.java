
public class EmployeeWageUC1 {

	public static void main(String[] args) {
				// Constant
				int IS_PRESENT = 1;

				double empCheck = Math.floor(Math.random() * 10) % 2;

				System.out.println(empCheck);

				if (empCheck == IS_PRESENT)
					System.out.println("Employee is Present");
				else
					System.out.println("Employee is Absent");

			}

		}