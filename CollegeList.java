package Inheritance;

import java.util.Scanner;
public class CollegeList {                 
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);

        Person prsn = new Person();
        Student sdnt = new Student();
        Faculty fct = new Faculty();
        Employee ely = new Employee();
        String display = "Regular";

    	String E,F,S;
    	String choose;
        String name, department, program;
        
        int number, yearLevel;
        double salary;
        


    	System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        choose = sc.nextLine();
        if (choose.equalsIgnoreCase("E")){
        System.out.println("FOR EMPLOYEE");
        System.out.println("Type employee's name, contact number, salary, and department.");
        System.out.println("Press Enter after every input");
        name = sc.next();
        prsn.setName(name);
        
        number = sc.nextInt();
        prsn.setContactNum(number); 

        salary = sc.nextDouble();
        ely.setSalary(salary);

        department = sc.next();
        ely.setDepartment(department);
        
        System.out.println("------------------------------"); 
        System.out.println("Name: " + prsn.getName());
        System.out.println("Contact Number: " + prsn.getContactNum());
        System.out.println("Salary: " + ely.getSalary());
        System.out.println("Department: " + ely.getDepartment());
            
        }
        else if (choose.equalsIgnoreCase("S")){
        System.out.println("FOR STUDENT");

        System.out.println("Type Student name, contact number, program, and year level.");
        System.out.println("Press Enter after every input");
        name = sc.next();
        prsn.setName(name);
        
        number = sc.nextInt();
        prsn.setContactNum(number); 

        program = sc.next();
        sdnt.setProgram(program);  

        yearLevel = sc.nextInt();
        sdnt.setYearLevel(yearLevel);

        System.out.println("------------------------------"); 
        System.out.println("Name: " + prsn.getName());
        System.out.println("Contact Number: " + prsn.getContactNum());
        System.out.println("Program: " + sdnt.getProgram());
        System.out.println("Year Level: " + sdnt.getYearLevel());
        }
        
        else if (choose.equalsIgnoreCase("F")){
            System.out.println("FOR FACULTY");
             System.out.println("------------------------------");
            System.out.print("Y if the faculty member is regular/tenured or N if not: ");
            choose = sc.nextLine();
            System.out.println("Type employee's name, contact number, salary, department, status.");
            System.out.println("Press Enter after every input");
            if(choose.equalsIgnoreCase("Y")){
            name = sc.next();
            prsn.setName(name);
            
            number = sc.nextInt();
            prsn.setContactNum(number); 
    
            salary = sc.nextDouble();
            ely.setSalary(salary);
    
            department = sc.next();
            ely.setDepartment(department);
            
            System.out.println("------------------------------"); 
            System.out.println("Name: " + prsn.getName());
            System.out.println("Contact Number: " + prsn.getContactNum());
            System.out.println("Salary: " + ely.getSalary());
            System.out.println("Department: " + ely.getDepartment());
            System.out.println("Status: " + fct.status());
            }
            else if (choose.equalsIgnoreCase("N")){
            System.out.println("------------------------------"); 
            
               
            }
            else {
                System.out.println("Invalid");
                
            }
        
        }        

        }
        }
            

    
        
    



        







    

    