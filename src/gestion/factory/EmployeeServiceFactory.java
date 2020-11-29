package gestion.factory;

import gestion.service.EmployeeService;
import gestion.service.EmployeeServicelmpl;

public class EmployeeServiceFactory {
	
	private static EmployeeService empService;
	static {
		empService=new EmployeeServicelmpl();
	}
	public static  EmployeeService getEmpoyeeService() {
		return empService;
	}

}
