package gestion.factory;

import gestion.dae.EmployeeDao;
import gestion.dae.EmployeeDaolmpl;

public class EmployeeDaoFactory {
	private static EmployeeDao empDao;
	static {
		empDao=new EmployeeDaolmpl();
	}
	
	public static EmployeeDao getEmployeeDaolmpl() {
		return empDao;
	}

	
	}


