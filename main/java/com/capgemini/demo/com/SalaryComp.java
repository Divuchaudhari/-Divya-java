package com.capgemini.demo.com;


	import java.util.Comparator;

	public class SalaryComp implements Comparator<Employee> {

		@Override
		public int compare(Employee emp1, Employee emp2) {

			return emp1.compareTo(emp2);

//			if (emp1.getSalary() > emp2.getSalary())
//				return 1;
//			else if (emp1.getSalary() < emp2.getSalary())
//				return -1;
//			else
//				return 0;

		}

}
