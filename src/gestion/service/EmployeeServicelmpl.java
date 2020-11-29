package gestion.service;

import gestion.bean.Employee;
import gestion.dae.EmployeeDao;
import gestion.factory.EmployeeDaoFactory;

public class EmployeeServicelmpl implements EmployeeService {

	

	@Override
	public String addEmployee(Employee emp) {
       EmployeeDao empdao=EmployeeDaoFactory.getEmployeeDaolmpl();
		String status= empdao.add(emp);
		return status;
	}

	@Override
	public Employee searchEmployee(int empno) {
		EmployeeDao empdao=EmployeeDaoFactory.getEmployeeDaolmpl();
        Employee emp=empdao.search(empno);
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) {
	
		return null;
	}

	@Override
	public String delete(int empno) {

		return null;
	}

}
