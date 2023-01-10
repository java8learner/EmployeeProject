package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> empset = new HashSet<Employee>();

    Employee emp1= new Employee(101, "Nkup", 24, "Consultant" , "Tester", 45000);
    Employee emp2= new Employee(102, "Aristide", 30, "IT" , "Cloud", 50000);
    Employee emp3= new Employee(103, "Leo", 40, "Projectmanager" , "Projectmanager", 60000);
    Employee emp4= new Employee(104, "Sylas", 50, "Geschäftführer" , "GeschäftFührer", 100000);

    Scanner sc = new Scanner(System.in);
    int id;
    boolean found= false;
    String name;
    int age ;
    String designation;
    String department;
    int salary;

    public EmployeeService(){
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);

    }

    //method to see all employees
    public void viewAllEmps(){
        for(Employee emp:empset){
            System.out.println(emp);
        }
    }

    //view emp based on their id
    public void viewEmp(){
        System.out.println("Enter id: ");
        id=sc.nextInt();
        for(Employee emp:empset){
            if(emp.getId()==id){
                System.out.println(emp);
                found= true;
            }
        }
        if(!found) {
            System.out.println("Employee with the id " + id + "was not found");
        }
    }

    //Update the employee
    public void updateEmployee(){
        System.out.println("Enter Id:\n");
        id = sc.nextInt();
        boolean found = false;
        for(Employee emp : empset){
            if(emp.getId()==id){
                System.out.println("Enter name: ");
                name = sc.next();
                System.out.println("Enter new Salary: ");
                salary= sc.nextInt();
                System.out.println("Enter new Designation: ");
                designation= sc.next();
                emp.setSalary(salary);
                emp.setDesignation(designation);
                System.out.println("Updated Employee Data are: ");
                System.out.println("emp");
                found=true;
            }
        }
        if(!found){
            System.out.println("Employee is not present");
        }
        else{
            System.out.println("New Employee data saved successfully !!");
        }
    }

    //delete emp
    public void deleteEmp() {
        System.out.println("Enter id:");
        id = sc.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                empdelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        } else {
            empset.remove(empdelete);
            System.out.println("New Employee data deleted successfully !!");
        }
    }
        //add emp
        public void addEmp(){
            System.out.println("Enter id: ");
            id = sc.nextInt();
            System.out.println("Enter name: ");
            name = sc.next();
            System.out.println("Enter age: ");
            age = sc.nextInt();
            System.out.println("Enter Designation: ");
            designation = sc.next();
            System.out.println("Enter Department: ");
            department = sc.next();
            System.out.println("Enter Salary: ");
            salary = sc.nextInt();

            Employee emp=new Employee(id, name, age, designation,department,salary);

            empset.add(emp);
            System.out.println(emp);
            System.out.println("New Employee added successfully ");

        }

    }


