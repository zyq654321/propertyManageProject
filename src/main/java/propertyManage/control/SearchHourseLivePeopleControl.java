package propertyManage.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import propertyManage.com.constant.PropertyConstant;
import propertyManage.com.constant.PropertyConstant.GENDER;
import propertyManage.com.constant.PropertyConstant.RELATIONSHIP;
import propertyManage.com.util.StringUtil;
import propertyManage.db.bean.HouseLivePeopleTransBean;
import propertyManage.db.bean.HouseLivePeopleTransWithNameBean;
import propertyManage.db.repository.HouseLivePeopleTransRepository;

@Controller
public class SearchHourseLivePeopleControl {

	@Autowired
	private HouseLivePeopleTransRepository houseLivePeopleTransRepository;
	

	@Autowired
	private MessageSource messageSource;

	@RequestMapping("/searchHouseLivePeople")
	@ResponseBody
	public Map<String, Object> execute(@RequestBody Map<String, String> requestInfo, HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		StringUtil.consoleLog("SearchHourseInfo!!!!!!");
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Long houseAccountId =  StringUtil.toLong(requestInfo.get("HouseAccountId"));
//		Integer addressTypeID =  StringUtil.toInteger(requestInfo.get("AddressTypeID"));
//		Integer addrClass1Info = StringUtil.toInteger(requestInfo.get("AddrClass1Info"));
//		Integer addrClass2Info = StringUtil.toInteger(requestInfo.get("AddrClass2Info"));
//		Integer addrClass3Info = StringUtil.toInteger(requestInfo.get("AddrClass3Info"));
//		Integer addrClass4Info = StringUtil.toInteger(requestInfo.get("AddrClass4Info"));
//		PropertyCommunityBean propertyCommunityBean= (PropertyCommunityBean)request.getSession().getAttribute(PropertyConstant.PROPERTY_INFO);
		

		

		try {
			resultMap.put(PropertyConstant.RESULT, PropertyConstant.RESULT_KBN.NG.getValue());
			
			List<HouseLivePeopleTransBean> houseLivePeopleTransBeanList=houseLivePeopleTransRepository.findByHouseAccountId(houseAccountId);
			
			
			if (houseLivePeopleTransBeanList ==null  || houseLivePeopleTransBeanList.size()==0) {
				String msg = messageSource.getMessage(PropertyConstant.MSG_KEY_SEARCH_NO_DATA, null, null);
				resultMap.put(PropertyConstant.MSG_CONTEXT, msg);
			}else {
				resultMap.put(PropertyConstant.RESULT, PropertyConstant.RESULT_KBN.OK.getValue());
				List<HouseLivePeopleTransWithNameBean> houseLivePeopleTransWithNameBeanList=new ArrayList<HouseLivePeopleTransWithNameBean>();
				for (HouseLivePeopleTransBean houseLivePeopleTransBean:houseLivePeopleTransBeanList) {
					HouseLivePeopleTransWithNameBean houseLivePeopleTransWithNameBean=new HouseLivePeopleTransWithNameBean();
					BeanUtils.copyProperties(houseLivePeopleTransBean, houseLivePeopleTransWithNameBean);
					houseLivePeopleTransWithNameBean.setGenderName(GENDER.getNameByValue(houseLivePeopleTransBean.getGender()));
					houseLivePeopleTransWithNameBean.setRelationshipName(RELATIONSHIP.getNameByValue(houseLivePeopleTransBean.getRelationship()));
					houseLivePeopleTransWithNameBeanList.add(houseLivePeopleTransWithNameBean);
				}
					
					
				resultMap.put(PropertyConstant.MSG_KEY_SEARCH_RESULT, houseLivePeopleTransWithNameBeanList);
				
			}
			
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultMap;

	}



}
