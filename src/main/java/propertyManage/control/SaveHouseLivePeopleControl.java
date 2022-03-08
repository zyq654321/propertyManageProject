package propertyManage.control;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import propertyManage.com.constant.PropertyConstant;
import propertyManage.com.util.StringUtil;
import propertyManage.db.bean.HouseLivePeopleTransBean;
import propertyManage.db.repository.HouseLivePeopleTransRepository;

@Controller
public class SaveHouseLivePeopleControl {
	
	@Autowired
	private HouseLivePeopleTransRepository houseLivePeopleTransRepository;
	
	
	@Autowired
	private MessageSource messageSource;

	
	@RequestMapping("/saveHouseLivePeople")
	@ResponseBody
	public Map<String,String> execute(@RequestBody Map<String, String> requestInfo, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		StringUtil.consoleLog("saveHouseLivePeople!!!!!!");
		Map<String,String> resultMap=new HashMap<String,String>();
		String peopleID = requestInfo.get("PeopleID");
		String peopleName = requestInfo.get("PeopleName");
		Long houseAccount = StringUtil.toLong(requestInfo.get("HouseAccount"));
		Long peopleCall = StringUtil.toLong(requestInfo.get("PeopleCall"));
		Integer updateFlg= StringUtil.toInteger(requestInfo.get("UpdateFlg"));
		Long selectedHouseLiveID=StringUtil.toLong(requestInfo.get("SelectedHouseLiveID"));
		Integer gender= StringUtil.toInteger(requestInfo.get("Gender"));
		Integer relationship= StringUtil.toInteger(requestInfo.get("Relationship"));
		HouseLivePeopleTransBean houseLivePeopleTransBean=new HouseLivePeopleTransBean();
		
		// delete people 
		if (1 == updateFlg) {
			
			Optional<HouseLivePeopleTransBean> optHouseLivePeopleTransBean =houseLivePeopleTransRepository.findById(selectedHouseLiveID);
			if (optHouseLivePeopleTransBean.isPresent()) {
				houseLivePeopleTransBean=optHouseLivePeopleTransBean.get();
			}
			houseLivePeopleTransBean.setMoveDate(new java.sql.Date(new java.util.Date().getTime()));
		}else {
			
			houseLivePeopleTransBean.setPeopleID(peopleID); 
			houseLivePeopleTransBean.setPeopleName(peopleName);
			houseLivePeopleTransBean.setHouseAccountId(houseAccount);
			houseLivePeopleTransBean.setPeopleCall(peopleCall);
			houseLivePeopleTransBean.setGender(gender);
			houseLivePeopleTransBean.setRelationship(relationship);
		}

		if (2 == updateFlg) {
			houseLivePeopleTransBean.setLiveInDate(new java.sql.Date(new java.util.Date().getTime()));
		}
		if (3 == updateFlg) {
			houseLivePeopleTransBean.setHouseLiveID(selectedHouseLiveID);
		}

		try {
			
			houseLivePeopleTransBean=houseLivePeopleTransRepository.save(houseLivePeopleTransBean);
			resultMap.put(PropertyConstant.RESULT, PropertyConstant.RESULT_KBN.OK.getValue());
			String msg=null;
			String[] para = { houseLivePeopleTransBean.getPeopleName() };
			if (1 == updateFlg) {
				msg=messageSource.getMessage(PropertyConstant.MSG_KEY_DEL_PEOPLE_SAVED, para,null);
			}else if(2 == updateFlg) {
				msg=messageSource.getMessage(PropertyConstant.MSG_KEY_ADD_PEOPLE_SAVED, para,null);
			}else if(3 == updateFlg) {
				msg=messageSource.getMessage(PropertyConstant.MSG_KEY_UDP_PEOPLE_SAVED, para,null);
			}
			 
			resultMap.put(PropertyConstant.MSG_CONTEXT, msg);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultMap;

	}
	

}
