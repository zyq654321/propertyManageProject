package propertyManage.com.constant;


public class PropertyConstant {
	
	public static String RESULT="Result";

	public static String MSG_CONTEXT="MsgContext";
	
	public static String MSG_KEY_NO_USER="NO_USER";
	
	public static String MSG_KEY_USER_PASSWORD_UNMATCH="USER_PASSWORD_UNMATCH";
	
	public static String MSG_KEY_NO_ROLE="NO_ROLE";
	public static String MSG_KEY_REQUEST_SAVED="REQUEST_SAVED";
	public static String MSG_KEY_HOUSE_INFO_SAVED="HOUSE_INFO_SAVED";
	public static String MSG_KEY_ADD_PEOPLE_SAVED="ADD_PEOPLE_SAVED";
	public static String MSG_KEY_DEL_PEOPLE_SAVED="DEL_PEOPLE_SAVED";
	public static String MSG_KEY_UDP_PEOPLE_SAVED="UDP_PEOPLE_SAVED";
	public static String MSG_KEY_ASIGN_OK="ASIGN_OK";
	public static String MSG_KEY_SEARCH_NO_DATA ="SEARCH_NO_DATA";
	public static String MSG_KEY_SEARCH_MULTI_RESULT ="SEARCH_MULTI_RESULT";
	
	public static String MSG_KEY_SEARCH_RESULT ="SEARCH_RESULT";
	public static String  USER_ROLE="UserRole";
	
	public static String  REQUEST_ID="requestId";
	
	public static String  USER_INFO="UserInfo";
	
	public static String  HOUSE_ADDR_TYPE="HouseAddrType";
	
	public static String  HOUSE_ADDR_TYPE_COUNT="HouseAddrTypeCount";
	
	public static String  PROPERTY_INFO="PropertyInfo";
	
	public static String  ALL_OPTION="99";
	
	public enum RESULT_KBN {
		
		OK("OK"),NG("NG");
		private String from;

		RESULT_KBN(String from) {
			this.from = from;
		}

		public String getValue() {
			return from;
		}

	}
	
	public enum PERIOD_KBN {
		
		SAME_DAY("0"),SAME_WEEK("1"),SAME_MONTH("2");
		private String from;

		PERIOD_KBN(String from) {
			this.from = from;
		}

		public String getValue() {
			return from;
		}

	}
	
	public enum ADDRESS_UNIT {
		RONG("弄", 0), HAO("号", 1), SHI("室", 2), HAOLOU("号楼", 3), 
		DONG("栋", 5), YUAN("园", 6), LOU("楼", 7),YUAN2("苑", 8), DASHA("大厦", 9), DALOU("大楼", 10), RENYI("任意", 99);

		private String name;
		private int index;

		ADDRESS_UNIT(String name, int index) {
			this.name = name;
			this.index = index;

		}

		public String getName() {
			return this.name;
		}

		public int getIndex() {
			return this.index;
		}

		public static String getNameByValue(int index) {

			String rtnString = "";
			for (ADDRESS_UNIT ts : ADDRESS_UNIT.values()) {
				if (ts.getIndex() == index) {
					rtnString = ts.name;
					break;

				}
			}
			return rtnString;
		}

	}
	
	public enum REQUEST_STATUS {
		REQUESTED("已申报", 0), ASSIGNED("已派单", 1), COMPLETED("已完工", 2), PAYED("已付款", 3), 
		CLOSED("已关闭", 5), YUAN("园", 6), LOU("楼", 7),YUAN2("苑", 8), DASHA("大厦", 9), DALOU("大楼", 10), RENYI("任意", 99);

		private String name;
		private int index;

		REQUEST_STATUS(String name, int index) {
			this.name = name;
			this.index = index;

		}

		public String getName() {
			return this.name;
		}

		public int getIndex() {
			return this.index;
		}

		public static String getNameByValue(int index) {

			String rtnString = "";
			for (REQUEST_STATUS ts : REQUEST_STATUS.values()) {
				if (ts.getIndex() == index) {
					rtnString = ts.name;
					break;

				}
			}
			return rtnString;
		}

	}
	
	public enum REQUEST_TYPE {
		SUIKAN("水管 、下水道等", 0), DENKI("电路、电器等", 1), KABE("墙体、门窗、地板 、天花板等", 2), NETWORK("有线、通信、网络设备等", 3), 
		TUURO("楼道、路面、停车场设施", 4), SONOTA("其他", 5);

		private String name;
		private int index;

		REQUEST_TYPE(String name, int index) {
			this.name = name;
			this.index = index;

		}

		public String getName() {
			return this.name;
		}

		public int getIndex() {
			return this.index;
		}

		public static String getNameByValue(int index) {

			String rtnString = "";
			for (REQUEST_TYPE ts : REQUEST_TYPE.values()) {
				if (ts.getIndex() == index) {
					rtnString = ts.name;
					break;

				}
			}
			return rtnString;
		}

	}
	
	public enum REQUEST_PUBLIC_PRIVATE {
		PRIVATE("私有部位", 1), PUBLIC("公共部位", 0);

		private String name;
		private int index;

		REQUEST_PUBLIC_PRIVATE(String name, int index) {
			this.name = name;
			this.index = index;

		}

		public String getName() {
			return this.name;
		}

		public int getIndex() {
			return this.index;
		}

		public static String getNameByValue(int index) {

			String rtnString = "";
			for (REQUEST_PUBLIC_PRIVATE ts : REQUEST_PUBLIC_PRIVATE.values()) {
				if (ts.getIndex() == index) {
					rtnString = ts.name;
					break;

				}
			}
			return rtnString;
		}

	}
	
	public enum GENDER {
		MALE("男", 0), FEMALE("女", 1);

		private String name;
		private int index;

		GENDER(String name, int index) {
			this.name = name;
			this.index = index;

		}

		public String getName() {
			return this.name;
		}

		public int getIndex() {
			return this.index;
		}

		public static String getNameByValue(int index) {

			String rtnString = "";
			for (GENDER ts : GENDER.values()) {
				if (ts.getIndex() == index) {
					rtnString = ts.name;
					break;

				}
			}
			return rtnString;
		}

	}
	public enum FEE_PERIOD {
		MONTH("每月", 0), YEAR("每年", 1), WEEK("每周", 2);

		private String name;
		private int index;

		FEE_PERIOD(String name, int index) {
			this.name = name;
			this.index = index;

		}

		public String getName() {
			return this.name;
		}

		public int getIndex() {
			return this.index;
		}

		public static String getNameByValue(int index) {

			String rtnString = "";
			for (FEE_PERIOD ts : FEE_PERIOD.values()) {
				if (ts.getIndex() == index) {
					rtnString = ts.name;
					break;

				}
			}
			return rtnString;
		}

	}
	
	public enum PROPERTY_RIGHT {
		OWNER("产权", 0), USER_ONLY("使用权", 1);

		private String name;
		private int index;

		PROPERTY_RIGHT(String name, int index) {
			this.name = name;
			this.index = index;

		}

		public String getName() {
			return this.name;
		}

		public int getIndex() {
			return this.index;
		}

		public static String getNameByValue(int index) {

			String rtnString = "";
			for (PROPERTY_RIGHT ts : PROPERTY_RIGHT.values()) {
				if (ts.getIndex() == index) {
					rtnString = ts.name;
					break;

				}
			}
			return rtnString;
		}

	}
	
	public enum RELATIONSHIP {
		COUPLE("夫妻", 0), CHILDREN("子女", 1), PARENTS("父母", 2), RENT("租赁", 3), RELATIVE("亲友", 4);

		private String name;
		private int index;

		RELATIONSHIP(String name, int index) {
			this.name = name;
			this.index = index;

		}

		public String getName() {
			return this.name;
		}

		public int getIndex() {
			return this.index;
		}

		public static String getNameByValue(int index) {

			String rtnString = "";
			for (RELATIONSHIP ts : RELATIONSHIP.values()) {
				if (ts.getIndex() == index) {
					rtnString = ts.name;
					break;

				}
			}
			return rtnString;
		}

	}


	}


