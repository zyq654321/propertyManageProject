package propertyManage.db.bean;


public class RequestTransactionBeanWithName extends RequestTransactionBean{
	 public String getRequestDateTimeStr() {
		return requestDateTimeStr;
	}
	public void setRequestDateTimeStr(String requestDateTimeStr) {
		this.requestDateTimeStr = requestDateTimeStr;
	}
	public String getRequestCurrentStatusStr() {
		return requestCurrentStatusStr;
	}
	public void setRequestCurrentStatusStr(String requestCurrentStatusStr) {
		this.requestCurrentStatusStr = requestCurrentStatusStr;
	}
	private String requestDateTimeStr;
	public String getAsignerName() {
		return asignerName;
	}
	public void setAsignerName(String asignerName) {
		this.asignerName = asignerName;
	}
	public String getAsignTime() {
		return asignTime;
	}
	public void setAsignTime(String asignTime) {
		this.asignTime = asignTime;
	}
	public String getAsignedWorkerName() {
		return asignedWorkerName;
	}
	public void setAsignedWorkerName(String asignedWorkerName) {
		this.asignedWorkerName = asignedWorkerName;
	}
	public Long getAsignedWorkerCall() {
		return asignedWorkerCall;
	}
	public void setAsignedWorkerCall(Long asignedWorkerCall) {
		this.asignedWorkerCall = asignedWorkerCall;
	}
	private String asignerName;
	private String asignTime;
	private String asignedWorkerName;
	private Long asignedWorkerCall;
	private String requestCurrentStatusStr;
	private String requestTypeName;
	 public String getRequestTypeName() {
		return requestTypeName;
	}
	public void setRequestTypeName(String requestTypeName) {
		this.requestTypeName = requestTypeName;
	}
	private String requestPrivatePublicStr;

	public String getRequestPrivatePublicStr() {
		return requestPrivatePublicStr;
	}
	public void setRequestPrivatePublicStr(String requestPrivatePublicStr) {
		this.requestPrivatePublicStr = requestPrivatePublicStr;
	}

}