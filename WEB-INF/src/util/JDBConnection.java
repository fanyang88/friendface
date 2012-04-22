package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBConnection {

	private static Connection conect;
	private static PreparedStatement ps;
	private static ResultSet rs;

	private static Connection getConnection() throws DataBaseException, SQLException {
		try {
			
			Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance(); 
			String url="jdbc:db2://db2serv01.cs.stonybrook.edu:50000/teamdb10";
			String user = "cseteam10";
			String password = "Spring2012";
			conect = DriverManager.getConnection(url, user, password);
			conect.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
			conect.setAutoCommit(false);
			
             
		} catch (Exception e) {
			throw new DataBaseException(e.getMessage());
		}
		return conect;
	}
	
	/**
	 * @throws SQLException 
	 * @throws DataBaseException 
	 */
	public static ResultSet getResultSet(String sql) throws SQLException, DataBaseException {
		conect=getConnection();
		try {
			ps = conect.prepareStatement(sql);
			rs = ps.executeQuery();
			return rs;
		} catch (SQLException e) {
			throw new SQLException(e.getMessage());
		}
	}
	/**
	 * sql查询封装list
	 * @param sql
	 * @return
	 * @throws DataBaseException
	 * @throws SQLException
	 */
	@SuppressWarnings("unchecked")
	public static List getList(String sql) throws DataBaseException, SQLException {
		List list =null;
		try {
			rs = getResultSet(sql);
			list = new ArrayList();
			Map map;
			while (rs.next()) {
				map = new HashMap();
				ResultSetMetaData rsmd = rs.getMetaData();
				int count = rsmd.getColumnCount();
				for (int i = 1; i <= count; i++) {
					String colName = rsmd.getColumnName(i).toLowerCase();
					map.put(colName, rs.getObject(i));
				}
				list.add(map);
			}
		}
		finally{
			conect.setAutoCommit(true);
			closeAll();
		}
		return list;

	}
	
	/**
	 * @param sql
	 * @throws SQLException 
	 * @throws DataBaseException 
	 */
	public static void executeUpdate(String sql) throws SQLException, DataBaseException  {
		conect=getConnection();
		try {
			ps = conect.prepareStatement(sql);
			ps.execute();
			conect.commit();
		} catch (SQLException e) {
			try {
				conect.rollback();
			} catch (SQLException e1) {
				throw new SQLException(e1.getMessage());
			}
			throw new SQLException(e.getMessage());
		}finally{
			closeAll();
		}
	}
	
	/**
	 * 关闭�?有与数据库连�?
	 * @throws SQLException
	 */
	public static void closeAll() throws SQLException {
		try {
			if (rs != null) {
				rs.close();
				rs=null;
			}
		} finally {
			try {
				if (ps != null) {
					ps.close();
					ps=null;
				}
			} finally {
				if (!conect.isClosed()) {
					conect.close();
					conect=null;
				}
			}
		}
	}	
}