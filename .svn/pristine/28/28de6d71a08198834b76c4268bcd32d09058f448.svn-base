package propertyManage.db.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import propertyManage.com.util.StringUtil;
import propertyManage.db.bean.HumanResourceBean;

@Component
public class GenerateTableDao {

	@Autowired
	private DataSource dataSource;

	private static String PACKAGE_NAME = "propertyManage.db";

	private static String FILE_PATH = "c:\\temp\\";

	private static Pattern linePattern = Pattern.compile("_(\\w)");

	public void execute() {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();

			DatabaseMetaData metadata = (DatabaseMetaData) con.getMetaData();

			System.out.println("数据库已知的用户: " + metadata.getUserName());

			System.out.println("数据库的系统函数的逗号分隔列表: " + metadata.getSystemFunctions());

			System.out.println("数据库的时间和日期函数的逗号分隔列表: " + metadata.getTimeDateFunctions());

			System.out.println("数据库的字符串函数的逗号分隔列表: " + metadata.getStringFunctions());

			System.out.println("数据库供应商用于 'schema' 的首选术语: " + metadata.getSchemaTerm());

			System.out.println("数据库URL: " + metadata.getURL());

			System.out.println("是否允许只读:" + metadata.isReadOnly());
			System.out.println("数据库的产品名称:" + metadata.getDatabaseProductName());

			System.out.println("数据库的版本:" + metadata.getDatabaseProductVersion());

			System.out.println("驱动程序的名称:" + metadata.getDriverName());

			System.out.println("驱动程序的版本:" + metadata.getDriverVersion());

			System.out.println();

			System.out.println("数据库中使用的表类型");

			ResultSet rs1 = metadata.getTableTypes();
			while (rs1.next()) {
				System.out.println(rs1.getString(1));

			}

			rs1.close();

			String[] tableType = { "TABLE" };
			
			//single table
			ResultSet rs2 = metadata.getTables("propertymanagedb", null, null, tableType);
			
			// all table
			//ResultSet rs2 = metadata.getTables("propertymanagedb", null, null, tableType);
			while (rs2.next())

			{
//				System.out.println();
//
//				System.out.println("数据库名:" + rs2.getString(1));
//
//				System.out.println("表名: " + rs2.getString(3));
//
//				System.out.println("类型: " + rs2.getString(4));

				if ("TABLE".equals(rs2.getString(4))) {
					
					String tablename = rs2.getString("TABLE_NAME");
					String tableComment=rs2.getString("REMARKS");
				

					String fileName = lineToHump(tablename).replaceAll("Mst", "");

					String fileNameUpperCase = fileName.substring(0, 1).toUpperCase() + fileName.substring(1);

					FileWriter fileWritter;

					// try {
					fileWritter = new FileWriter(FILE_PATH + "\\BEAN\\" + fileNameUpperCase + "Bean.java", false);
					fileWritter.write("package " + PACKAGE_NAME + ".bean;\r\n");
					fileWritter.write("\r\n");
					fileWritter.write("import org.springframework.data.annotation.Id;\r\n");
					fileWritter.write("import org.springframework.data.relational.core.mapping.Table;\r\n");
					fileWritter.write("import java.math.BigDecimal;\r\n");
					fileWritter.write("import java.sql.Date;\r\n");
					fileWritter.write("import java.sql.Timestamp;\r\n");
					fileWritter.write("\r\n");
					fileWritter.write("@Table(\"" + tablename + "\")\r\n");
					fileWritter.write("public class " + fileNameUpperCase + "Bean{\r\n");


					ResultSet rskey = metadata.getPrimaryKeys(null, null, tablename);
					String keyName = "";
					if (rskey.next())

					{
						keyName = rskey.getString(4);
					}
					rskey.close();

					ResultSet columns = metadata.getColumns(null, null, tablename, null);

					while (columns.next()) {
						String columnComment = columns.getString("REMARKS");

						String columnName = columns.getString("COLUMN_NAME");
						String lowCasecolumnName = columnName.substring(0, 1).toLowerCase() + columnName.substring(1);


						String convertedType = conventType(columns.getString("TYPE_NAME"));
						if (columnName.equals(keyName)) {
							fileWritter.write("    @Id \r\n");
						}
						fileWritter.write("    /** " + columnComment + " */\r\n");
						fileWritter.write("    private " + convertedType + " " + lowCasecolumnName + ";\r\n");
						fileWritter.write("\r\n");
						
						fileWritter.write("    /** \r\n");
						fileWritter.write("     * " + columnComment + "的取得  \r\n");
						fileWritter.write("     * @return " +convertedType+" "+ columnComment + "  \r\n");
						fileWritter.write("     */  \r\n");
						fileWritter.write("    public " + convertedType + " get" + columnName + "() {\r\n");
						fileWritter.write("        return " + lowCasecolumnName + ";\r\n");
						fileWritter.write("    }\r\n");
						fileWritter.write("\r\n");
						fileWritter.write("    /* \r\n");
						fileWritter.write("     *  " + columnComment + "的设值  \r\n");
						fileWritter.write("     * @param " +convertedType+" "+ lowCasecolumnName + "  \r\n");
						fileWritter.write("     */  \r\n");
						fileWritter.write("    public void set" + columnName + "(" + convertedType + " "
								+ lowCasecolumnName + "){\r\n");
						fileWritter.write("        this." + lowCasecolumnName + " = " + lowCasecolumnName + ";\r\n");
						fileWritter.write("    }\r\n");
						fileWritter.write("\r\n");
	
						
					} // rs3.close();
					fileWritter.write("}");
					fileWritter.flush();
					fileWritter.close();
					FileWriter fileWritterRepository;
					// try {
					fileWritterRepository = new FileWriter(
							FILE_PATH + "\\Repository\\" + fileNameUpperCase + "Repository.java", false);
					
					fileWritterRepository.write("package " + PACKAGE_NAME + ".repository;\r\n");
					fileWritterRepository.write("\r\n");
					fileWritterRepository.write("import org.springframework.data.repository.CrudRepository;\r\n");
					fileWritterRepository.write("import propertyManage.db.bean." + fileNameUpperCase + "Bean;\r\n");
					fileWritterRepository.write("\r\n");
					fileWritterRepository.write("/** \r\n");
					fileWritterRepository.write(" *  "+tableComment+" Repository \r\n");
					fileWritterRepository.write(" */  \r\n");
					fileWritterRepository.write("public interface " + fileNameUpperCase
							+ "Repository extends CrudRepository<" + fileNameUpperCase + "Bean,Long>{\r\n");

					fileWritterRepository.write("\r\n");
					fileWritterRepository.write("}");
					fileWritterRepository.flush();
					fileWritterRepository.close();
				}
			}

			rs2.close();
			System.out.println("end!!!");

		} catch (Exception e) {
			e.printStackTrace();
			StringUtil.consoleLog(e.toString());
		} finally {
			rs = null;
			stmt = null;
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				;
			}
		}
	}

	/** 下划线转驼峰 */
	private static String lineToHump(String str) {
		str = str.toLowerCase();
		java.util.regex.Matcher matcher = linePattern.matcher(str);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
		}
		matcher.appendTail(sb);
		return sb.toString();
	}

	/**
	 * @param str
	 * @return
	 * @throws Exception
	 */
	private static String conventType(String str) throws Exception {
		String[] originalStr = { "INT", "SMALLINT", "TINYINT", "BIGINT", "FLOAT", "DATETIME", "VARCHAR", "CHAR", "DATE",
				"BIT", "TINYTEXT", "TEXT" };
		String[] targetStr = { "Integer", "Integer", "Integer", "Long", "BigDecimal", "Timestamp", "String", "String",
				"Date", "Boolean", "String", "String" };
		String rtnString = "";

		boolean matched = false;
		for (int i = 0; i < originalStr.length; i++) {
			if (str.startsWith(originalStr[i])) {
				rtnString = targetStr[i];
				matched = true;
				break;
			}
		}
		if (!matched) {
			throw new Exception();
		}
		return rtnString;
	}
}
