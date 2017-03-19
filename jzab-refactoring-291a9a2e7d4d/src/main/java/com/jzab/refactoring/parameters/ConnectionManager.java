package com.jzab.refactoring.parameters;

import java.sql.Connection;

/**
 *
 * @author zjaramil
 */
interface ConnectionManager {

  public Connection createConnection();

}
