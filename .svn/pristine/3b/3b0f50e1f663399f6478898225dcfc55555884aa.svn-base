package propertyManage.com.util;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import propertyManage.com.constant.PropertyConstant;

public class StringUtil {

	static private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static private SimpleDateFormat dfDate = new SimpleDateFormat("yyyy-MM-dd");

	private static final Logger LOG = LoggerFactory.getLogger(StringUtil.class);

	static public boolean isBlank(String checkStr) {
		boolean rtn = false;

		if (checkStr == null || checkStr.length() == 0) {
			rtn = true;
		}
		return rtn;
	}
	
	static public boolean isBlank(Long checkStr) {
		boolean rtn = false;

		if (checkStr == null || checkStr.longValue() == 0L) {
			rtn = true;
		}
		return rtn;
	}

	static public void consoleLog(String log) {

		LOG.info(log);

	}

	static public boolean isNotBlank(String checkStr) {
		boolean rtn = false;

		if (checkStr != null && checkStr.length() > 0) {
			rtn = true;
		}
		return rtn;
	}
	
	static public boolean isNotBlank(Long checkStr) {
		boolean rtn = false;

		if (checkStr != null && checkStr.longValue() > 0L) {
			rtn = true;
		}
		return rtn;
	}

	static public void debugLog(String log) {
		LOG.debug(log);

	}

	static public String toString(String checkStr) {
		String rtn = "";

		if (checkStr != null) {
			rtn = checkStr.toString();
		}
		return rtn;
	}

	static public String toString(Float checkStr) {
		String rtn = "";

		if (checkStr != null) {
			rtn = checkStr.toString();
		}
		return rtn;
	}

	static public String toString(BigDecimal checkStr) {
		String rtn = "";

		if (checkStr != null) {
			rtn = checkStr.toPlainString();
		}
		return rtn;
	}

	static public String toString(java.sql.Time checkStr) {
		String rtn = "";

		if (checkStr != null) {
			rtn = checkStr.toString();
		}
		return rtn;
	}

	static public String toString(Integer checkStr) {
		String rtn = "";

		if (checkStr != null) {
			rtn = checkStr.toString();
		}
		return rtn;
	}

	static public String toString(Long checkStr) {
		String rtn = "";

		if (checkStr != null) {
			rtn = checkStr.toString();
		}
		return rtn;
	}

	static public String toString(java.sql.Date iDate) {
		String rtn = "";

		if (iDate != null) {

			rtn = df.format(iDate);
		}
		return rtn;
	}

	static public String toDateString(java.sql.Date iDate) {
		String rtn = "";

		if (iDate != null) {

			rtn = dfDate.format(iDate);
		}
		return rtn;
	}

	static public String toDateString(java.util.Date iDate) {
		String rtn = "";

		if (iDate != null) {

			rtn = dfDate.format(iDate);
		}
		return rtn;
	}

	static public String toString(java.sql.Timestamp iDate) {
		String rtn = "";
		if (iDate != null) {
			rtn = df.format(iDate);
		}
		return rtn;
	}

	static public String toString(java.sql.Timestamp iDate, String format) {
		String rtn = "";
		if (iDate != null) {
			SimpleDateFormat sdf = new SimpleDateFormat(format);// 小写的mm表示的是分钟
			rtn = sdf.format(iDate);
		}
		return rtn;
	}

	static public String toDateString(java.sql.Timestamp iDate) {
		String rtn = "";
		if (iDate != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 小写的mm表示的是分钟
			rtn = sdf.format(iDate);
		}
		return rtn;
	}
	
	static public Integer toInteger(String intStr) {
		Integer rtn = null;
		if (intStr != null && intStr.length()>0) {
			
			rtn = Integer.valueOf(intStr);
		}
		return rtn;
	}
	static public Long toLong(String longStr) {
		Long rtn = null;
		if (longStr != null && longStr.length()>0) {
			
			rtn = Long.valueOf(longStr);
		}
		return rtn;
	}
	static public BigDecimal strToBigDecimal(String Str) {
		BigDecimal rtn = null;
		if (Str != null && Str.length()>0) {
			
			rtn = new BigDecimal(Str);
		}
		return rtn;
	}

	static public String toTimeString(java.sql.Timestamp iDate) {
		String rtn = "";
		if (iDate != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");// 小写的mm表示的是分钟
			rtn = sdf.format(iDate);
		}
		return rtn;
	}

	static public String toDateTimeString(java.sql.Timestamp iDate) {
		String rtn = "";
		if (iDate != null) {

			rtn = df.format(iDate);
		}
		return rtn;
	}

	static public String toDateTimeString(java.sql.Date iDate) {
		String rtn = "";
		if (iDate != null) {

			rtn = df.format(iDate);
		}
		return rtn;
	}

	static public Timestamp toTimeStamp(String strDateTime) {
		Timestamp rtn = null;
		if (strDateTime != null) {
			// SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd
			// HH:mm:ss");//小写的mm表示的是分钟
			rtn = Timestamp.valueOf(strDateTime);

		}
		return rtn;
	}

	static public java.sql.Date strToDate(String strDateTime) {

		java.sql.Date rtn = null;

		if (strDateTime != null) {

			strDateTime = strDateTime.replace("/", "-");
			// SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd
			// HH:mm:ss");//小写的mm表示的是分钟
			try {
				rtn = new java.sql.Date(dfDate.parse(strDateTime).getTime());
			} catch (ParseException parseException) {
				parseException.printStackTrace();
			}

		}
		return rtn;
	}

	static public List stringToBean(String objetStr, String beanName) {
		List rtn = new ArrayList();
		try {
			Class beanClass = Class.forName(beanName);
			String[] beanStringArray = objetStr.substring(1, objetStr.length() - 2).split("},");
			String realbeanString = null;
			Method m1 = null;
			String value = null;
			String key = null;
			for (String beanString : beanStringArray) {
				Object object = beanClass.newInstance();
				realbeanString = beanString.substring(1);
				String[] fields = realbeanString.split(",");
				for (String field : fields) {
					String[] keyValue = field.split(":");
					key = keyValue[0].substring(1, keyValue[0].length() - 1);
					key = key.substring(0, 1).toUpperCase() + key.substring(1, key.length());
					m1 = beanClass.getMethod("set" + key, String.class);
					value = keyValue[1];
					if (value.startsWith("\"")) {
						value = value.substring(1, value.length() - 1);
					}

					m1.invoke(object, value);
				}
				rtn.add(object);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return rtn;
	}

	/**
	 * 来月末の取得
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public static Calendar getLastDayOfCurrentMonth(String currentDate) {

		if (currentDate == null || currentDate.length() < 10) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(currentDate.substring(0, 4)), Integer.parseInt(currentDate.substring(5, 7)) - 1,
				Integer.parseInt(currentDate.substring(8, 10)));

		int lastDay = cal.getActualMaximum(Calendar.DATE);

		// 月末
		cal.set(Calendar.DAY_OF_MONTH, lastDay);

		return cal;
	}

	public static String toString(Calendar calendar) {

		if (calendar == null) {
			return "";
		}

		return dfDate.format(calendar.getTime());

	}
	public static boolean isEqual(String s1,String s2) {
		boolean compareRes=false;
		
		if (s1 !=null && s1.equals(s2)) {
			compareRes =true; 
		}
		return compareRes;
	}
	
	public static Integer optionAllToNull(String str) {
		Integer rtnObject=null;
		if (isNotBlank(str) && !PropertyConstant.ALL_OPTION.equals(str)) {
			rtnObject=Integer.valueOf(str);
		}
		return rtnObject;
	}
}
