import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import util.DbUtil;

public class EmployeeRepo {
	public void createEmployee(Employee emp) {

		try {
			String sql = "insert into Employee (id, firstname, lastname, designation, age, salary) values(?,?,?,?,?,?)";
			PreparedStatement pstmt = DbUtil.getConnection().prepareStatement(sql);
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setString(4, emp.getDesignation());
			pstmt.setInt(5, emp.getAge());
			pstmt.setInt(6, emp.getSalary());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateEmployee(Employee emp) {
		String sql = "update table employee set firtname = ? where id =?";
		//TODO: please get all the new value from user and update the employee
		System.out.println("Under construction");

	}

	public void deleteEmployee(int id) {
		try {
			String sql = "delete from employee where id =?";
			PreparedStatement pstmt = DbUtil.getConnection().prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Map<Integer, Employee> getAllEmployee() {
		Map<Integer, Employee> map = new HashMap<>();
		String sql = "Select * from Employee";
		try {
			PreparedStatement preparedStatement = DbUtil.getConnection().prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				Employee employee = new Employee();
				employee.setId(id);
				employee.setFirstName(resultSet.getString("firstname"));
				employee.setLastName(resultSet.getString("lastname"));
				employee.setDesignation(resultSet.getString("designation"));
				employee.setAge(resultSet.getInt("age"));
				employee.setSalary(resultSet.getInt("salary"));
				map.put(id, employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;
	}

	public void getEmployeeById() {
		System.out.println("Under construction");

	}

}
