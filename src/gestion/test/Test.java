package gestion.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import gestion.bean.Employee;
import gestion.factory.EmployeeServiceFactory;
import gestion.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("1:- ADD");
				System.out.println("2:- SEARCH");
				System.out.println("3:- UPDATE");
				System.out.println("4:- DELETE");
				System.out.println("5:- EXIT");
				System.out.print("enter your choice(1,2,3,4,5)  :");
				int option=Integer.parseInt(br.readLine());
				int empno,sal;
				String ename;
				EmployeeService empservice=EmployeeServiceFactory.getEmpoyeeService(); 
				Employee emp=null;
				switch(option) {
				case 1:
					System.out.print("Employee Nb  :");
					empno=Integer.parseInt(br.readLine());
					System.out.print("Employee Name  :");
				    ename=br.readLine();
					System.out.print("Employee salary  :");
					sal=Integer.parseInt(br.readLine());
					emp=new Employee();
					emp.setEmpno(empno);
					emp.setEname(ename);
					emp.setSal(sal);
				    String status=empservice.addEmployee(emp);			
					System.out.println("Status :"+status);
					
					break;
				case 2:
					System.out.print("Employee Nb  :");
					empno=Integer.parseInt(br.readLine());
					emp=empservice.searchEmployee(empno);
					 
					if(emp==null) {
						System.out.println("Employee Doesnt Exist");
					}
					else {
						System.out.println("Employee Record ");
						System.out.println("Employee _ _ _ __ _ _ _ _ _");
						System.out.println("Employee No :"+emp.getEmpno());
						System.out.println("Employee Name : "+emp.getEname());
						System.out.println("Employee salary :"+emp.getSal());
						
					}
				
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					System.out.println("thanks for using Employee application");
					System.exit(0);
					break;
					
			    default:	
			    	System.out.println("Enter 1,2,3,4,5");
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
	

}
