package com.company;

import java.util.Scanner;

public class Main {
    EmployeeService service = new EmployeeService();
    static boolean ordering = true;

    public static void menu() {
        System.out.println("*********************Welcome to Employee management System: *************"
                + "\n1. Add Employee "
                + "\n2. View Employee"
                + "\n3. Update Employee"
                + "\n4. Delete Employee"
                + "\n5. View  All Employee"
                + "\n6. Exit\n");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();



        do{
            menu();
            System.out.println("Enter your choice\n");
            int choise = sc.nextInt();

            switch (choise){

                case 1:
                    System.out.println("Add Employee");
                    service.addEmp();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmp();
                    break;
                case 5:
                    System.out.println("View All Employee");
                    service.viewEmp();
                    break;
                case 6:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Please Enter Valid choice");
                    break;

            }

        }while(ordering);
    }
}