package com.mediaiq.bi.server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

public class JdbcTest {

	@Test
	public void test() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("welcome");
		dataSource
				.setUrl("jdbc:mysql://localhost:3306/information_schema");

		System.out.println("Setting up data source.");
		//
		// Now, we can use JDBC DataSource as we normally would.
		//
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			System.out.println("Creating connection.");
			conn = dataSource.getConnection();
			System.out.println("Creating statement.");
			stmt = conn.createStatement();
			System.out.println("Executing statement.");
			rset = stmt.executeQuery("select count(*) from ENGINES;");
			System.out.println("Results:");
			int numcols = rset.getMetaData().getColumnCount();
			while (rset.next()) {
				for (int i = 1; i <= numcols; i++) {
					System.out.print("\t" + rset.getString(i));
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
			} catch (Exception e) {
			}
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}
}
