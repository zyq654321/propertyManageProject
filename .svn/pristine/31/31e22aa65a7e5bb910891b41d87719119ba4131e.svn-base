package propertyManage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestClass {
	
	private static int golVal=1;
	
	private static String PACKAGE_NAME = "propertyManage.db.bean";

	private static String BEAN_FILE_PATH = "c:\\temp\\";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File file = new File(BEAN_FILE_PATH + "Test" + "Bean.java");

		// true = append file
		String tablename="Test";
		FileWriter fileWritter;
		try {
			fileWritter = new FileWriter(BEAN_FILE_PATH + tablename + "Bean.java", true);
			 fileWritter.write("package "+PACKAGE_NAME+";\r\n");
			 fileWritter.write("\r\n");
			fileWritter.write("import org.springframework.data.annotation.Id;\r\n");
			fileWritter.write("import org.springframework.data.relational.core.mapping.Table;");
			 fileWritter.write("\r\n");
			 fileWritter.write("@Table(\""+tablename+")\"");
			fileWritter.flush();
			fileWritter.close();
			System.out.println("end!!!" );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0;i<1000;i++) {
			System.out.println(sub(String.valueOf(i)));
		}
		
	}
	
	private static String  sub(String str) {
		String rtn=str+"a";
		String a=rtn+golVal;
		
		return rtn;
	}

}
