package com.java8.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparatorTest {

	public static void main(String[] args) {
		List<ComparatorEmployee> employeeList = new ArrayList<ComparatorEmployee>();
		employeeList.add(new ComparatorEmployee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new ComparatorEmployee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new ComparatorEmployee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new ComparatorEmployee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new ComparatorEmployee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new ComparatorEmployee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new ComparatorEmployee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new ComparatorEmployee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new ComparatorEmployee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new ComparatorEmployee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new ComparatorEmployee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new ComparatorEmployee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new ComparatorEmployee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new ComparatorEmployee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new ComparatorEmployee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new ComparatorEmployee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new ComparatorEmployee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
	/*	System.out.println("Sorting by name");
		System.out.println("+++++++++++++++");
		Comparator<ComparatorEmployee> comparator1 = (emp1, emp2) -> {
			return emp1.name.compareTo(emp2.name);
		};

		Collections.sort(employeeList, comparator1);
		for (ComparatorEmployee emp : employeeList) {
			System.out.println("Sorting by name --> " + emp.name);
		}

		System.out.println("Sorting by age");
		System.out.println("+++++++++++++++");
		Comparator<ComparatorEmployee> comparator2 = (emp1, emp2) -> {
			return new Integer(emp1.age).compareTo(emp2.age);
		};
		Collections.sort(employeeList, comparator2);
		for (ComparatorEmployee emp : employeeList) {
			System.out.println("Sorting by age --> " + emp.age);
		}
		
		System.out.println("Sorting by salary");
		System.out.println("+++++++++++++++");
		Comparator<ComparatorEmployee>comparator3=(emp1,emp2) -> {
			return new Double(emp1.salary).compareTo(emp2.salary);
		};
		Collections.sort(employeeList, comparator3);
		for(ComparatorEmployee emp:employeeList) {
			System.out.println("Sorting by salary -->  " + emp.salary);
		}*/
		
		System.out.println("Sorting by name");
		System.out.println("**********************************");
		Comparator<ComparatorEmployee> employeeNameComparator=Comparator.comparing(ComparatorEmployee:: getName).reversed();
		Collections.sort(employeeList, employeeNameComparator);
		for(ComparatorEmployee emp:employeeList) {
			System.out.println("Sorting by name --> " + emp.name);
		}
		
		
		System.out.println("Sorting by years of joining");
		System.out.println("**********************************");
		Comparator<ComparatorEmployee> employeeYOJComparator= Comparator.comparingInt(ComparatorEmployee:: getYearOfJoining);		
		Collections.sort(employeeList,employeeYOJComparator);
		for(ComparatorEmployee emp:employeeList) {
		System.out.println("Sorting by Years of Joining -->" + emp.yearOfJoining);
		}
		
		System.out.println("Sorting by id");
		System.out.println("**********************************");
		Comparator<ComparatorEmployee>employeeIdComparator=Comparator.comparingInt(ComparatorEmployee:: getId);
		Collections.sort(employeeList,employeeIdComparator);
		for(ComparatorEmployee emp: employeeList) {
			System.out.println("Sorting by id --> " + emp.id);
		}
		
        System.out.println("Sorting by salary");
        System.out.println("**********************************");
        Comparator<ComparatorEmployee> employeeSalaryComparator=Comparator.comparingDouble(ComparatorEmployee:: getSalary);
        Collections.sort(employeeList, employeeSalaryComparator);
        for(ComparatorEmployee emp:employeeList) {
        	System.out.println("Sorting by salary --> " + emp.salary);
        }
	}

}
