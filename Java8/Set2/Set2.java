package Java8.Set2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Set2 {
  public static void main(String[] args) {
    

Employee emp = new Employee("sai", "HR", 45000, "Male", LocalDate.of(2000, 5, 05));
		Employee emp2 = new Employee("krishna", "Accounting", 45000, "Male", LocalDate.of(2002, 2, 02));
		Employee emp3 = new Employee("Anusha", "IT", 60000, "Female", LocalDate.of(2009, 9, 23));
		Employee emp4 = new Employee("Ashok", "IT", 50000, "Male", LocalDate.of(2003, 5, 20));

		List<Employee> emps = new ArrayList<>();
		emps.add(emp);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		
System.out.println("How many male and female employee ");
 
   Long noOfMale= emps.stream().filter(em->em.getGender().equals("Male")).count();
 System.out.println(noOfMale);

 System.out.println("Print Department in the org");
//Extract or transform we use map
  List<String> listDepartment=emps.stream().map(e->e.getDepartment()).toList();
  System.out.println(listDepartment);
  List<String> listDistinctDepartment=emps.stream().map(e->e.getDepartment()).distinct().toList();
  System.out.println(listDistinctDepartment);

  System.out.println("Higest paid employee");

 Employee higestPaidEmployee= emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();

 System.out.println(higestPaidEmployee);

 Employee higestpaidEmployee= emps.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
System.out.println(higestpaidEmployee);  

System.out.println("Lowest paid employee");

Employee minSalaryEmployee= emps.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();
System.out.println(minSalaryEmployee);
//All Employee who joined after 2000

List<Employee> employeesAfter=emps.stream().filter(e->e.getJoiningDate().getYear()>2000).toList();

System.out.println(employeesAfter);
}  
}
