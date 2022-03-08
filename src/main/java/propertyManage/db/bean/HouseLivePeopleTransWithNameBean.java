package propertyManage.db.bean;

public class HouseLivePeopleTransWithNameBean extends HouseLivePeopleTransBean {
	
	private String relationshipName;
	
	private String genderName;

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

	public String getRelationshipName() {
		return relationshipName;
	}

	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}

}
