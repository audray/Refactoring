package com.jzab.refactoring.parameters;

import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.NamingException;

/**
 *
 * @author zjaramil
 */
public class Main {



  public static void main(String[] args) throws NamingException, SQLException{
    ConnectionManager connection = null;
    Context context =  null;
    String viewName = "HR$V_EMPLOYEES";

    EmployeeDAO dao = new EmployeeDAO();
    dao.getAllEmployees(connection, context, viewName);

    dao.getEmployeesWithName(connection, context, viewName, "Carlos");

    dao.getEmployee(connection, context, viewName, 10);

    dao.insert(connection, context, viewName, "Tony Stark", "Enginnering", "M3", 1);
    dao.insert(connection, context, viewName, "PEter Parker", "Security", "IC2", 1);
  }

}
