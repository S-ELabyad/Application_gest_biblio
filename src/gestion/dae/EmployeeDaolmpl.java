package gestion.dae;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import gestion.bean.Employee;
import gestion.factory.ConnectionFactory;

public class EmployeeDaolmpl implements EmployeeDao {

	@Override
	public String add(Employee emp) {
		String status="";
		try {
			Connection con=ConnectionFactory.getConnection();
			Statement st =con.createStatement();
		
			String empno = null;
			ResultSet rs=st.executeQuery("select * from emp where empno="+empno);
			boolean b=rs.next();
			if (b==true) {
				status="Employee Already Exists";
			}
			else {
				int rowcount=st.executeUpdate("insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")");
				if(rowcount==1) {
					status="Employee Inserted Successfully";
				}
				else {
					status="Insertion failed";
				}
			}

		}
		catch(Exception e) {
			status="Insertion faileder";
		}

		return status;
	}

	@Override
	public Employee search(int empno) {
		Employee emp=new Employee(); 
		
		try {
			Connection con=ConnectionFactory.getConnection();
			Statement st =con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp where empno="+empno);
			boolean b=rs.next();
			if(b==true) {
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setSal(rs.getInt("sal"));
				
				
			}
			else {
				emp=null;
			}
		}
		catch(Exception e) {
		   e.printStackTrace();
		}

		return emp;
	}

	@Override
	public String update(Employee emp) {
	
		return null;
	}

	@Override
	public String delete(int empno) {

		return null;
	}

}
