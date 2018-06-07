package com.bridgeit.JDBCTemplateExample;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
      ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Web.xml");
      System.out.println("");
      EmployeeDAO empDAO=(EmployeeDAO) context.getBean("empdao");
      Employee employee=new Employee();
//      employee.setEmpid(103);
//      employee.setEmpname("rani");
//      employee.setSalary(15000);
//      empDAO.InsertEmployee(employee);
//      System.out.println("List of Employees");
//      for(Employee emp:empDAO.getAllEmployeeDetails()) {
//    	  System.out.println("HI "+emp);
//      }
     System.out.println("which operation u wants to perform: 1>>Insert detais of employee  2>>Delete any record  3>>Get any record using id  4>>Upadte any record  5>>Select All Record");
      System.out.println("Enter ur choose ");
      int choose=scanner.nextInt();
       switch(choose) {
      
       case 1:
    	   System.out.println("enter empId, EmpName and EmpSalary"); 
    	   employee.setEmpid(scanner.nextInt());
    	   employee.setEmpname(scanner.next());
    	   employee.setSalary(scanner.nextInt());
           empDAO.InsertEmployee(employee);

    	    break;
       case 2:
    	  System.out.println("enter the Employee id number for delet record");
    	  int id=scanner.nextInt();
    	  empDAO.deletEmpById(id);
    	   break;
       case 3:
    	   System.out.println("enter the Employee id number for get info of that id");
     	  int id1=scanner.nextInt();
     	  System.out.println(empDAO.getEmpById(id1));
    	   break;
       case 4:
    	   System.out.println("upadte record for enterd id");
    	   int id2=scanner.nextInt();
    	   int salary=scanner.nextInt();
    	   
    	   empDAO.updateEmpNameById(salary, id2);
    	   break;
       case 5:
    	   System.out.println("List of Employees");
  	      for(Employee emp:empDAO.getAllEmployeeDetails()) {
  	    	  System.out.println("HI "+emp);
  	      }
    	   break;
      }
    }
}
