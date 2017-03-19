package com.jzab.refactoring.parameters;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import javax.naming.Context;
import javax.naming.NamingException;

/**
 *
 * @author zjaramil
 */
public class EmployeeDAO {

  public List<String> getAllEmployees(ConnectionManager manager, Context context,
                                      String viewName) throws NamingException, SQLException{

    context.getEnvironment().get("Something");
    //SOME SQL CODE
    return Collections.emptyList();
  }

  public List<String> getEmployeesWithName(ConnectionManager manager, Context context, String viewName,
                                           String name) throws NamingException, SQLException{
    context.getEnvironment().get("Other");
    //SOME SQL CODE
    return Collections.emptyList();
  }

  public String getEmployee(ConnectionManager manager, Context context, String viewName,
                            int id) throws NamingException, SQLException{
    context.getEnvironment().get("Another");
    //SOME SQL CODE
    return "";
  }

  public void insert(ConnectionManager manager, Context context, String viewName, String name, String department,
                     String level, int managerId) throws NamingException, SQLException{
    Connection connection = null;
    try{
      Object value = context.getEnvironment().get("Another");
      connection = manager.createConnection();
      PreparedStatement statement = connection.prepareStatement("Insert into ....");
      statement.setString(1, name);
      statement.executeUpdate();
    }
    finally{
      if(connection != null)
        connection.close();      
    }
  }

}
