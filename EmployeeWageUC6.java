
public class EmployeeWageUC6 {
		public static void main(String[] args) {
			//Constant
	   final int IS_FULL_TIME = 1;
	   final int IS_PART_TIME = 2;
	   final int SALARY_PER_HOUR = 20;
	   final int NUM_OF_WORKING_DAYS = 2;
	   final int MAX_HRS_IN_MONTH = 10;
			//Variables
			@SuppressWarnings("unused")
			int empCheck;

			int empHr = 0;
			int totalEmpHrs = 0;
			int totalWorkingDays = 0;

			while (totalEmpHrs <= MAX_HRS_IN_MONTH  && totalWorkingDays < NUM_OF_WORKING_DAYS){
				totalWorkingDays++;
			int empCheck1 = (int)(Math.floor(Math.random() * 10) % 3) ;
			switch(empCheck1) {
				case IS_FULL_TIME :
					empHr = 8;
				break;

				case IS_PART_TIME :
					empHr=4;
				break;

				default :
					empHr=0;
			}

			totalEmpHrs += empHr;
			System.out.println("#Day: " + totalWorkingDays + " EmpHrs: " +empHr);

		}
		int totalEmpWage = totalEmpHrs * SALARY_PER_HOUR;
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}

	}