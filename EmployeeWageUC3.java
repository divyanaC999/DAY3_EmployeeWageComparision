
public class EmployeeWageUC3 {

        public static void main ( String[] args){
                int IS_PRESENT = 1;
		int IS_PART_TIME = 2;
                int SALARY_PER_HOUR = 20;

                double empCheck = Math.floor(Math.random() * 10) % 3;
                int empHrs = 0;

                if (empCheck == IS_PRESENT){
                        empHrs = 8;
                } else if (empCheck == IS_PART_TIME) {
			empHrs = 4;
		} else {
			empHrs = 0;
		}
                double empSalary = empHrs * SALARY_PER_HOUR;

                        System.out.println("Employee has earned " +empSalary+ " dollar per day");
        }
}